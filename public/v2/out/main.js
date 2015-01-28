/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId])
/******/ 			return installedModules[moduleId].exports;
/******/
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			exports: {},
/******/ 			id: moduleId,
/******/ 			loaded: false
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.loaded = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(0);
/******/ })
/************************************************************************/
/******/ ([
/* 0 */
/***/ function(module, exports, __webpack_require__) {

	var setup_code_snippets, setup_home;

	$(function() {
	  console.log('current_page = ' + window.current_page);
	  switch (window.current_page) {
	    case 'home':
	      setup_home();
	  }
	  return setup_code_snippets();
	});

	setup_home = function() {
	  var container, current, iter, quotes;
	  container = $('.quote-carroussel-wrapper').find('.content');
	  quotes = container.find('blockquote').toArray();
	  $(quotes).remove();
	  current = null;
	  return (iter = function() {
	    var doshow;
	    doshow = function() {
	      current = quotes.shift();
	      container.append(current);
	      return $(current).hide().fadeIn(1000, function() {
	        return setTimeout(iter, 3000);
	      });
	    };
	    if (current != null) {
	      return $(current).fadeOut(1000, function() {
	        $(current).remove();
	        quotes.push(current);
	        return doshow();
	      });
	    } else {
	      return doshow();
	    }
	  })();
	};

	setup_code_snippets = function() {
	  return $('pre').each(function() {
	    var $code, $pre, cm, code_str;
	    $pre = $(this);
	    $code = $pre.find('code');
	    code_str = $code.text();
	    $pre.empty();
	    cm = CodeMirror(this, {
	      value: code_str,
	      mode: 'yaml',
	      theme: 'neo',
	      readOnly: true
	    });
	    return $pre.find('.CodeMirror').css('height', 'auto');
	  });
	};


/***/ }
/******/ ])