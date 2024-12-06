## 開発環境構築
### 前提
- 以下をインストールしておくこと。
  - [VSCode](https://code.visualstudio.com/download)

### 1. VSCodeの準備
1. コンテナ内を表示するVSCodeの拡張機能から、以下のプラグインを検索してインストールする
   - vscjava.vscode-java-pack
   - vmware.vscode-boot-dev-pack
   - vscjava.vscode-gradle
   - shardulm94.trailing-spaces
   - christian-kohler.path-intellisense
   - MS-CEINTL.vscode-language-pack-ja
   - aaron-bond.better-comment

### 2. Springを起動してみる
1. サイドバーの「Sprind Boot Dashboard」タブを選択
2. APPS直下にある「sample1ap-spring」右横にある実行ボタン（▷）を押下
3. `localhost:8080/api` にアクセスすると、 `本サービスはAPIを提供しますOpenAPI仕様書をご確認の上、適切なAPIパスをご利用ください。` と表示されます。

### DB接続情報

- ./h2db:mem
  - h2dbの設定内容やエラー時のログ情報などがここへ格納される