<html><head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="http://localhost/ProjetoWEB/lib/js/jquery.min.js"></script>
    <script type="text/javascript" src="http://localhost/ProjetoWEB/lib/js/bootstrap.min.js"></script>
    <link href="http://localhost/ProjetoWEB/lib/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://localhost/ProjetoWEB/lib/css/bootstrap.css" rel="stylesheet" type="text/css">
    <link href="http://localhost/ProjetoWEB/lib/css/padrao.css" rel="stylesheet" type="text/css">
    <title>Pagina de autenticacao</title>
  </head><body>
    <div class="section section-danger text-justify">
      <div class="container">
        <div class="row text-center">
          <div class="col-md-12 text-center">
            <h1 class="text-center">Sistema de Gerenciamento de Cursos</h1>
          </div>
        </div>
      </div>
    </div>
    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12 text-center">
            <h3 class="tt_menu">&gt;&gt; Autenticacao &lt;&lt;</h3>
          </div>
        </div>
        <div class="row">
          <div class="col-md-12">
            <form class="form-horizontal" role="form" action="http://localhost/ProjetoWEB/Controlador" method="post">
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="inputEmail3" class="control-label">Informar o CPF:</label>
                </div>
                <div class="col-sm-10">
                  <input type="text" name="cpf" class="form-control" id="inputEmail3" placeholder="cpf" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" title="Digite um CPF no formato: xxx.xxx.xxx-xx" required>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="inputSenha" class="control-label">Informar a senha:</label>
                </div>
                <div class="col-sm-10">
                  <input type="password" name="senha" class="form-control" id="inputSenha" placeholder="Senha" required>
                </div>
              </div>
              <button type="submit" class="btn btn-danger">Entrar</button>
            </form>
          </div>
        </div>
      </div>
    </div>
    ${ mensagem }
    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12 text-center corrigir">
            <a class="btn btn-default" href="javascript:window.history.go(-1)">Voltar</a>
          </div>
        </div>
      </div>
    </div>
    <footer>
      <div class="navbar navbar-fixed-bottom bgred">
        <div class="container">
          <div class="row">
            <div class="col-sm-12 text-center" style="top:13px;color:#fff;">� ABCTreinamentos - Curso de Java 8 para Web</div>
          </div>
        </div>
      </div>
    </footer>
  

</body></html>