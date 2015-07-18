# extreme-fishbowl

レッツゴーデベロッパー555での「Extreme Fishbowl」のコンテンツです。
ポーカー役判定を実装します。

## 仕様
1. カードは2-10,J,Q,K,Aの13種が4セットある計52枚を1組のデッキとして使用する
2. カードは2-10,J,Q,K,Aの順に並び、後になるほど位が高い
~~3. プレイヤーはデッキから5枚のカードを取得し、自分の手札とする~~
~~4. プレイヤーは手札にある任意の枚数を場に捨てることができる~~
~~5. プレイヤーは捨てた枚数分デッキからカードを再取得できる~~
3. カードには黒のスペード、クラブ、赤のダイヤ、ハートの4種のスートがある
4. カードの一意性は担保されなければならないが、役判定にその責務はない
6. 手札に同位のカードが2枚そろっていたら、「ワンペア」の役が成立する
7. 手札に同位のカード2枚が二組そろっていたら、「ツーペア」の役が成立する
8. 手札に同位のカードが3枚そろっていたら、「スリーカード」の役が成立する
9. 手札の全てが順番にそろっていたら、「ストレート」の役が成立する
10. 手札の全てが同色でそろっていたら、「フラッシュ」の役が成立する
11. 手札に同位のカードが3枚と同位のカードが2枚そろっていたら、「フルハウス」の役が成立する
12. 手札に同位のカードが4枚そろっていたら、「フォーカード」の役が成立する
13. プレイヤーは他のプレイヤーと手札を比較して勝敗を付けることができる
14. 「ワンペア」が成立した手札は役が成立しなかった手札に勝つ
15. 両者とも「ワンペア」が成立した場合は、ペアのカードの位が高い方が勝つ
16. 「ツーペア」が成立した手札は「ワンペア」が成立した手札に勝つ
17. 両者とも「ツーペア」が成立した場合は、互いの高い方のペアのカードの位が高い方が勝つ
18. 「スリーカード」が成立した手札は「ツーペア」が成立した手札に勝つ
19. 「ストレート」が成立した手札は「スリーカード」が成立した手札に勝つ
20. 「フラッシュ」が成立した手札は「ストレート」が成立した手札に勝つ
21. 「フルハウス」が成立した手札は「フラッシュ」が成立した手札に勝つ
22. 「フォーカード」が成立した手札は「フルハウス」が成立した手札に勝つ
