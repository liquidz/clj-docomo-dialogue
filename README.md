# clj-docomo-dialogue

[![Clojars Project](http://clojars.org/clj-docomo-dialogue/latest-version.svg)](http://clojars.org/clj-docomo-dialogue)

## Usage

```clj
(require '[clj-docomo-dialogue.core :refer :all])

(def api-key "YOUR DOCOMO API KEY")

(talk api-key "こんにちは")
(talk api-key "こんにちは" {:t 30})
(talk api-key "こんにちは" {:context "CONTEXT"})
```

## License

Copyright (c) 2015 [uochan](http://twitter.com/uochan)

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
