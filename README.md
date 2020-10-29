Basic setup to use Integrant-REPL reloaded workflow with Clojure CLI tools and Emacs CIDER.

`.dir-locals.el` file contains some configurations:

- `cider-ns-refresh` hooks for reloaded code changes
- `cider-clojure-cli-global-options` for call `cider-jack-in` with `:dev` alias from `deps.edn`
