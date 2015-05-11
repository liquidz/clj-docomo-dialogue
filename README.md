# clj-docomo-dialogue

## Usage

```clj
(require '[clj-docomo-dialogue.core :refer :all])

(def api-key "YOUR DOCOMO API KEY")

(talk api-key "����ˤ���")
(talk api-key "����ˤ���" {:t 30})
(talk api-key "����ˤ���" {:context "CONTEXT"})
```

## License

Copyright (c) 2015 [uochan](http://twitter.com/uochan)

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
