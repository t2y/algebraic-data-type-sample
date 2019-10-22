# algebraic-data-type-sample

java sample for algebraic data type and evaluator

## Reference

This repository provides a sample code to understand below article.

* [Why the next language you learn should be functional](https://queue.acm.org/detail.cfm?id=2038036)
  * [なぜ次に学ぶ言語は関数型であるべきか](https://ymotongpoo.hatenablog.com/entry/20111105/1320506449)
  * [代数的データ型とオブジェクト指向プログラミングと](https://qiita.com/t2y/items/bbb359c371ccebd68a8b)

## How to run

```bash
$ gradle run

> Task :run
# confirm original evaluator behavior
true instance: true
false instance: false
true and false: false
not(true and false): true

# confirm enum evaluator behavior
true instance: true
false instance: false
true and false: false
not(true and false): true

# confirm functions evaluator behavior
true instance: true
false instance: false
true and false: false
not(true and false): false
(true and false) and (not(false or true)): false

BUILD SUCCESSFUL in 2s
2 actionable tasks: 2 executed
```

