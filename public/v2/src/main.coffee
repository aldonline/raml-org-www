$ ->
  console.log 'current_page = ' + window.current_page
  switch window.current_page
    when 'home'
      setup_home()

  setup_code_snippets()

setup_home = ->
  container = $('.quote-carroussel-wrapper').find('.content')
  quotes = container.find('blockquote').toArray()
  $(quotes).remove()
  current = null
  do iter = ->
    doshow = ->
      current = quotes.shift()
      container.append current
      $(current).hide().fadeIn 1000, ->
        setTimeout iter, 3000
    if current?
      $(current).fadeOut 1000, ->
        $(current).remove()
        quotes.push current
        doshow()
    else
      doshow()

setup_code_snippets = ->
  $('pre').each ->
    $pre = $ @
    $code = $pre.find('code')
    code_str = $code.text()
    $pre.empty()
    cm = CodeMirror @,
      value:    code_str
      mode:     'yaml'
      theme:    'neo'
      readOnly: yes
    $pre.find('.CodeMirror').css 'height', 'auto'