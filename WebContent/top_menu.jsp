<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="css/materialize/css/materialize.css">
<script src="js/jquery-3.2.1.js" ></script>
<script src="css/materialize/js/materialize.js" ></script>
<script type="text/javascript">


$(document).ready(function() {
	
  $('select').material_select();
  $(".button-collapse").sideNav();
});
          

</script>


  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Cormorant+Garamond|Poiret+One" rel="stylesheet"> 
<link rel="stylesheet" href="css/style.css" >
</head>
<body>

		
	
	
  <ul id="slide-out" class="side-nav">
    <li><div class="user-view">
      <div class="background">
        <img src="images/office.jpg">
      </div>
      <a href="#!user"><img class="circle" src="http://static.cdn.ea.com/battlelog/prod/emblems/320/665/bf3/2832655391943438665.jpeg?v=1364759635"></a>
      <a href="#!name"><span class="white-text name">SysAcademic</span></a>
      <a href="#!email"><span class="white-text email">sysacademic@ufc.com</span></a>
    </div></li>
    <li><a href="#!"><i class="material-icons">settings</i>SysAcademic</a></li>
    <li><a href="#!">ufccrateus@ufc.br</a></li>
    <li><div class="divider"></div></li>
    <li><a class="subheader">MENU</a></li>
     <li><a class="waves-effect" href="cadastro-aluno.jsp"><i class="material-icons left">account_box</i>Cadastrar Alunos</a></li>
      <li><a class="waves-effect" href="cadastro-disciplina.jsp"><i class="material-icons left">note_add</i>Cadastrar Disciplinas</a></li>
    <li><a class="waves-effect" href="index.jsp"><i class="material-icons left">school</i>Alunos</a></li>
    <li><a class="waves-effect" href="disciplinas.jsp"><i class="material-icons left">book</i>Disciplinas</a></li>
     <li><a class="waves-effect" href="matricula.jsp"><i class="material-icons left">toc</i>Matricula</a></li>
     <li><a class="waves-effect" href="check-discipline.jsp">Verificar Alunos</a></li>
      <li><a class="waves-effect" href="historico.jsp">Gerar Histórico</a></li>
    <li><a class="waves-effect" href="#!"><i class="material-icons">exit_to_app</i>Sair</a></li>
 
  </ul>
  <a href="#" data-activates="slide-out" class="button-collapse"  style="font-size: 30px;color: #000;"><i class="material-icons left"  style="font-size: 46px;">menu</i></a>
  <h3>Menu</h3>      
	
<hr>

</body>
</html>