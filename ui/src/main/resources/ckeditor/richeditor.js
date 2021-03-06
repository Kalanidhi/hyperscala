function createRichEditor(id) {
    CKEDITOR.replace(id);
    var lastValue;

    var editor = CKEDITOR.instances[id];
    var editable = null;
    editor.on('instanceReady', function() {
        editable = editor.editable();
        editable.on('blur', function() {
            var value = editor.getData();
            if (value != lastValue) {
                communicator.send('change', id, {
                    value: value
                });
                communicator.send('event', id, {
                    event: 'change'
                });
                lastValue = value;
            }
        });
    });
}

function updateRichEditor(id, value) {
    var editor = CKEDITOR.instances[id];
    var editable = editor.editable();
    editable.setHtml(value);
}