# Hirbert

## 描画速度が落ちないようにした工夫
上下左右の移動に三角関数を扱っているため計算に時間がかかっている。`order=9`の時に`262143 x 2`回実行されるので、数十msかかる。これを配列でのアクセスに変更したところ、数msに改善される見込みがあることがわかった。しかし、その他の部分で大幅に時間がかかっているため、描画速度は依然として遅いままである。
