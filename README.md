# Feriados.BR

Em vez de procurar e cadastrar todos os feriados de sua cidade um a um que tal solicitar todos apenas uma vez. Bem essa é a minha ideia com o apoio do site [calendario.com.br](http://www.calendario.com.br).
O funcionamento é bem simples você cadastra seu email, recebe um token e tem direito a consutlar 5 cidades por mês, lembrando que são todos os feriados do ano.

Maven
--------
```xml
<!-- https://mvnrepository.com/artifact/com.github.krismorte/feriados.br -->
<dependency>
    <groupId>com.github.krismorte</groupId>
    <artifactId>feriados.br</artifactId>
    <version>1.0</version>
</dependency>
```

#### Exemplo

```java
String token = "#########################"

FeriadoBR feriadosBr = new FeriadoBR(token);

Events events = feriadosBr.get(2018,"CE","FORTALEZA");

for(Event event: events.getEvent()){
  System.out.Println("Feriado de :"+event.getName());
}
```

 # Mais Informações
 
 Para mais detalhes sobre o site vejam a pagina sobre a API [calendario.com.br](http://www.calendario.com.br/api_feriados_municipais_estaduais_nacionais.php)
 ou
 Entre em contato com eles para saber dos planos pagos calendario@calendario.com.br>
 
