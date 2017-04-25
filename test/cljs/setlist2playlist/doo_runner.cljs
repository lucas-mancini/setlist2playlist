(ns setlist2playlist.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [setlist2playlist.core-test]))

(doo-tests 'setlist2playlist.core-test)
