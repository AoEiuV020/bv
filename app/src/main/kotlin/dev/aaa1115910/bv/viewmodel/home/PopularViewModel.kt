package dev.aaa1115910.bv.viewmodel.home

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import dev.aaa1115910.biliapi.http.BiliHttpApi
import dev.aaa1115910.biliapi.http.entity.video.VideoInfo
import dev.aaa1115910.bv.BVApp
import dev.aaa1115910.bv.util.Prefs
import dev.aaa1115910.bv.util.fError
import dev.aaa1115910.bv.util.fInfo
import dev.aaa1115910.bv.util.toast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import mu.KotlinLogging

class PopularViewModel : ViewModel() {
    private val logger = KotlinLogging.logger {}
    val popularVideoList = mutableStateListOf<VideoInfo>()

    private var currentPage = 0
    private var pageSize = 20
    var loading = false

    suspend fun loadMore() {
        if (!loading) loadData()
    }

    private suspend fun loadData() {
        loading = true
        logger.fInfo { "Load more popular videos" }
        runCatching {
            val responseData = runBlocking {
                BiliHttpApi.getPopularVideoData(
                    pageNumber = ++currentPage,
                    pageSize = pageSize,
                    sessData = Prefs.sessData
                ).getResponseData()
            }
            popularVideoList.addAll(responseData.list)
        }.onFailure {
            logger.fError { "Load popular video list failed: ${it.stackTraceToString()}" }
            withContext(Dispatchers.Main) {
                "加载热门视频失败: ${it.localizedMessage}".toast(BVApp.context)
            }
        }
        loading = false
    }

    fun clearData() {
        popularVideoList.clear()
        currentPage = 0
        loading = false
        pageSize = 20
    }

    fun readAllData(){

    }
}