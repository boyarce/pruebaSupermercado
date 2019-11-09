/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function load() {
            const Http = new XMLHttpRequest();
            const url = '../ListTipoServlet';
            Http.open('GET', url);
            Http.send();
        }

      
        function edit(row) {


            editRow(row, false, false, true, true,
                    false, false);
        }

       
        function cancelRow(row) {
            editRow(row, true, true, false, false,
                    true, true);
        }

       
        function editRow(row, nombreDisabled, descripcionDisbled, editDisabled, deleteDisabled,
                saveDisabled, cancelDisabled) {

            var txtNombre = "txt-nombre-" + row;
            var txtDescripcion = "txt-descripcion-" + row;
            var btnEdit = 'bnt-edit-' + row;
            var btnDelete = 'bnt-delete-' + row;
            var btnSave = 'bnt-save-' + row;
            var btnCancel = 'bnt-cancel-' + row;

            document.getElementById(txtNombre).disabled = nombreDisabled;
            document.getElementById(txtDescripcion).disabled = descripcionDisbled;
            document.getElementById(btnEdit).hidden = editDisabled;
            document.getElementById(btnDelete).hidden = deleteDisabled;
            document.getElementById(btnSave).hidden = saveDisabled;
            document.getElementById(btnCancel).hidden = cancelDisabled;
        }

        
        function saveRow(row) {

            var id = document.getElementById("txt-id-" + row).value;
            var nombre = document.getElementById("txt-nombre-" + row).value;
            var descripcion = document.getElementById("txt-descripcion-" + row).value;
            cancelRow(row);
            const Http = new XMLHttpRequest();
            const url = '../UpdateTipoServlet?id=' + id + '&nombre=' + nombre
                    + '&descripcion=' + descripcion;
            Http.open('GET', url);
            Http.send();
        }

        function deleteRow(row) {
            var id = document.getElementById("txt-id-" + row).value;
            cancelRow(row);

            $.ajax({
                url: '../DeleteTipoServlet?id=' + id,
                method: 'GET',
                success: window.location.reload()
            });

        }

