<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<form name="formPersona" id="formPersona" action="/ajax03" method="post">
	<fieldset>
		<legend>Filtrar Platos</legend>
		<div id="formulario">

			<div class="etiqueta">
				<label for="tipo">Tipo :</label>
			</div>
			<div class="control">
				<select name="tipo" id="tipo">
					<option value="todo">-------</option>
					<option value="entrada">Entrada</option>
					<option value="platofondo">Plato de Fondo</option>
					<option value="sopa">Sopas</option>
					<option value="picante">Picantes</option>
				</select>
			</div>

			<div class="etiqueta">
				<label for="criterio">Criterio :</label>
			</div>
			<div class="control">
				<select name="criterio" id="criterio">
					<option value="todo">-------</option>
					<option value="platofrio">Platos frios</option>
					<option value="marino">Marinos</option>
					<option value="salado">Salados</option>
				</select>
			</div>
			<div class="etiqueta">
				<label for="tipocarne">Tipo de Carne :</label>
			</div>
			<div class="control">
				<select name="tipocarne" id="tipocarne">
					<option value="todo">-------</option>
					<option value="pollo">Pollo</option>
					<option value="res">Res</option>
					<option value="chancho">Chancho</option>
					<option value="cordero">Cordero</option>
				</select>
			</div>
		</div>
		<div id="action">
				<input type="submit" value="Buscar" />
			</div>
		</div>

		</div>
	</fieldset>
</form>
