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


            editRow(row, false, false, false,false,false,false,false,false,false,
            true, true, false, false);
        }

       
        function cancelRow(row) {
            editRow(row, true, true, true,true,true,true,true,true,true,
            false, false,true, true);
        }

       
        function editRow(row, nombreDisabled, descripcionDisabled, regionesDisabled, editDisabled, deleteDisabled,
                saveDisabled, cancelDisabled) {

            var txtRun = "txt-run-" + row;
            var txtNombre = "txt-nombre-" + row;
            var txtApa = "txt-apa-" + row;
            var txtAma = "txt-ama-" + row;
            var cmbTipos = "cmb-tipos-" + row;         
            var txtTelefono = "txt-telefono-" + row;
            var txtRemuneracion = "txt-remuneracion-" + row;
            var txtFecha = "txt-fecha-" + row;
            var txtDireccion= "txt-direccion-" + row;
            var txtcorreo = "txt-correo-" + row;
            var btnEdit = 'bnt-edit-' + row;
            var btnDelete = 'bnt-delete-' + row;
            var btnSave = 'bnt-save-' + row;
            var btnCancel = 'bnt-cancel-' + row;

            document.getElementById(txtRun).disabled = nombreDisabled;
            document.getElementById(txtNombre).disabled = descripcionDisabled;
            document.getElementById(txtApa).disabled = descripcionDisabled;
            document.getElementById(txtAma).disabled = descripcionDisabled;
            document.getElementById(cmbTipos).disabled = regionesDisabled; 
            document.getElementById(txtTelefono).disabled = descripcionDisabled;
            document.getElementById(txtRemuneracion).disabled = descripcionDisabled;
            document.getElementById(txtDireccion).disabled = descripcionDisabled;
            document.getElementById(txtcorreo).disabled = descripcionDisabled;
            document.getElementById(btnEdit).hidden = editDisabled;
            document.getElementById(btnDelete).hidden = deleteDisabled;
            document.getElementById(btnSave).hidden = saveDisabled;
            document.getElementById(btnCancel).hidden = cancelDisabled;
        }

      
        function saveRow(row) {

            var run = document.getElementById("txt-run-" + row).value;
            var nombre = document.getElementById("txt-nombre-" + row).value;
            var apa = document.getElementById("txt-apa-" + row).value;
            var ama = document.getElementById("txt-ama-" + row).value;
            var idTipos = document.getElementById("cmb-tipos-" + row).value;
            var telefono = document.getElementById("txt-telefono-" + row).value;
            var remuneracion = document.getElementById("txt-remuneracion-" + row).value;
            var fecha = document.getElementById("txt-fecha-" + row).value;
            var direccion = document.getElementById("txt-direccion-" + row).value;
            var correo = document.getElementById("txt-correo-" + row).value;
            cancelRow(row);
            const Http = new XMLHttpRequest();
            const url = '../UpdateEmpleadoServlet ?run=' + run + '&nombre=' + nombre
                    + '&apa=' + apa + '&ama=' + ama + '&idTipos=' + idTipos
                    + '&telefono=' + telefono+ '&remuneracion=' + remuneracion
                    + '&fecha=' + fecha+ '&direccion=' + direccion+ '&correo=' + correo;
            Http.open('GET', url);
            Http.send();
        }

        function deleteRow(row) {
            var run = document.getElementById("txt-run-" + row).value;
            cancelRow(row);
            $.ajax({
                url: '../DeleteEmpleadoServlet?id=' + run,
                method: 'GET',
                success: window.location.reload()
            });

        }

