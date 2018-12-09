# 各クラウドPaaSデモアプリ


## [AWS Beanstalk](https://github.com/nyasba/spring-integration-cloud-demo/tree/aws)


## [GCP AppEngine](https://github.com/nyasba/spring-integration-cloud-demo/tree/gcp)

### 事前準備

* gcloudSDKのインストール
* gcloudSDKのapp-engine-java

```
gcloud init
gcloud components list
gcloud components install app-engine-java
gcloud auth application-default login

gcloud config list
gcloud config set project {YOUR_PROJECT}
```

### ローカル起動

```
./gradlew clean appengineRun
```

### デプロイ

```
./gradlew clean appengineDeploy
```
