<div align="center">

<img src="app/src/main/res/drawable/ic_banner.webp" style="border-radius: 24px; margin-top: 32px;"/>

# BV

~~Bug Video~~

![GitHub tag (latest by date)](https://img.shields.io/github/v/tag/aaa1115910/bv?label=version)
![Android Sdk Require](https://img.shields.io/badge/android-5.0%2B-informational)
![GitHub](https://img.shields.io/github/license/aaa1115910/bv)
![Release workflow](https://github.com/aaa1115910/bv/actions/workflows/release.yml/badge.svg)

**BV 不支持在中国大陆地区内使用，如有相关使用需求请使用 [云视听小电视](https://app.bilibili.com)**

</div>

---
BV ~~(Bug Video)~~ 是一款 [哔哩哔哩](https://www.bilibili.com) 的第三方 `Android TV`
应用，使用 `Jetpack Compose` 开发，支持 `Android 5.0+`

都是随心乱写的代码，能跑就行。

## 特色

- :bug: 丰富多样的 Bug
- :children_crossing: 反人类设计
- :zap: 卡卡卡卡卡
- :art: 异样审美

## 安装

你可以在 [这里](https://install.appcenter.ms/users/aaa1115910-gmail.com/apps/bv/distribution_groups/public)
获取到持续集成版本。

## 自行编译注意事项

### google-services.json

该项目使用 Firebase Crashlytics 进行异常日志统计，因此需要用到 `google-services.json` 文件。

你应该在 [Firebase](https://console.firebase.google.com/)
上创建一个新的应用，并下载获取你自己的 `google-services.json` 文件，并将其放置于 `app` 目录下。
