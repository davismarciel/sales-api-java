Objetivos:

-  Criar projeto com Spring e Java.
- Implementar modelo de domínio.
- Estrutura camadas lógicas: resource, service, repository.
- Configurar a camada de segurança
- Configurar banco de dados de teste (H2).
- Povoar o banco de dados.
- CRUD 
- Tratamento de exceções

## Tecnologias usadas:

- Java 17
- Postman
- Maven
- H2
- Docker
- PostgreSQL
- Spring Web
- Spring Security

## Modelo do projeto:

# Diagrama

Para visualizar o diagrama, clique no link abaixo:

[Ver Diagrama](https://viewer.diagrams.net/?tags=%7B%7D&lightbox=1&highlight=0000ff&edit=_blank&laye
rs=1&nav=1&title=diagrama.drawio#R%3Cmxfile%3E%3Cdiagram%20name%3D%22Page-1%22%20id%3D%226133507b-19e7-1e82-6fc7-422aa6c4b21f%22%3E7
V1rb9s2FP01BrYBCfSwZPlj4qSpgTQLkrTbPg2MxdjcJNGT6Drerx8pUbIkXjturUfmEggQ84qiJZ5D8p7Lhwf2JHy9idFy8Yn6OBhYhv86sK8GlmU6Y4%2F%2FE5ZNZhm5dmaYx8SXmbaGR%2FIvlkZDWlfEx0kl
I6M0YGRZNc5oFOEZq9hQHNN1NdsLDarfukRzrBgeZyhQrb8Rny2k1TSM7YWPmMwX8qs9R154RrO%2F5zFdRfL7Ihrh7EqI8mJk1mSBfLoumezrgT2JKWXZp%2FB1ggNRrXmNZfd92HG1eOQYR%2ByQGyzbcRx35FnIs7HrG
2eyhK8oWMlqmCCG5zTeyAdmm7x%2BkjUJA8Rfzb5csDDgRpN%2FfKERe5SZRBoFZB7xzzP%2BRDjmhq84ZoTX8oW8wOiSW2cLEvi3aENX4rkTxqswT10uaEz%2B5cWi%2FDv45ZhJwlhuJcejuJObDW6NccLz3OeVYRamW5QwmWdGgwAtE%2FJcPHCI4jmJLiljNJSZ8jf9QIJ
gQgPKX%2BMqBZUXKGDGfp4xhzMrOiQz%2BTlAzzi4LHhRKyRhMf27IFlai%2Bo3iYr9gEISiOb0Bcc%2BilBe31lVmJYKf44nr3T8WjJJOtxgGmImwDXkVXt07mT3yGY7zGm9LjUCR%2BZZlPnvyrYn2928KHtLQP5BcvBAPloKH88GgtMuCgVtAsGPaooXlafnlatZyr7g9085F%2BecjXVK8zpiVTpn0NShUNHJaR7gF7aT5MkSz
Ug0v03zXA23lgdZi8K0XhCGH7ldPNOad63cRnl5L0HKrAXxfRylzGOIoYy3gmJLSiKWVr1zyf94HU0MDqXD32vC0%2BY2zf9E9phNaMTfD5GULJg3ijVOsiqr02hnP%2FE2rySNLPcwFlltsMgGWRShEGd8eGQxR0HToTs6OFaPdHAVOijQB6Q%2BsB3USb%2BBe8jRCvAW6CfBg6szUyGDrZLBBkBOh5V7mhBGqCg%2FzvLWwO8D35F
34KBxPLwP4a1xs157j9Qc2jfGdDxjz2eOgij2uXcnk7wyFnROIxRcb621sXyb55amMAmU%2FsKMbeRwi1aMVinC6y%2Fe%2FC7u5y1LJv%2BQxaWJq9dKaiNTO4fthK7iGc5rdOya3Kt%2BMVw89rB3Zo6kU8wdFvwGcOLl98IW4wAx8rXq%2Bh6Dys7HLbW6%2B5j6K%2B65a8%2FyR%2FAsLcWzBBzLETQGGA30EgofLdgp0K5lx
77E7o7iKN8SJFIDzoTKo6F2Lt8bISDvEiKE3Zb7oYZRBCd8nMxissycNU2NXqgxPnDQsY02fKCxVh6tI2xaB0LcVuOHY1bLmMzkiHBFV6ImdbPvkhSAIG2r3YOsgN1NEs4%2Fx4EeDfqihdMhLZ7Hw%2BeZaXszNPYM%2FHLmKVB%2Fa4yixIm3dCDXtRdiUqxmE8JTFlbWvl4ao%2FBrd3BLKT9P5fLQPVRFfm%2BsYyhbTznWsRP%2
B5oId6a28EtCmlEFyelvyvTBsda7jVmWuOTbLLPnW%2FPxD9gRbjhWv8n1eyFDtin6NfUCz6jjMKcZhnLwvy%2FlmQ%2FLZUPtA0xm24BMPYf2s4zB9j6ZFN3FcHAYgUitxmKED8ijkRYtXTP1uxLTX3SUhwDgMRIjW4jCwFqNiuOMDCVslGTN%2BLRk0QbojiAdJdYAgrURjHDVKp4CvozFHImyaB0LcxhyPozb%2FgXXJeO0FP%2B
tQTG%2BMgDR3S25CXXObahM%2FQnT7KFmk9tYVOF2mWPenwF0Zum5YX
Ctq2Har6qRYKpsXkYUA5F1bInyrSrft%2BmT0fpVu5yoJzt%2B8SnfVuYLUS5kyHCoc1kr9FJV64R5JztlQz%2BlASj3%2F%2BkZH07yPrjnT%2F6xQxAjbaN3dzIhaNPzj1ta2NKCCMgua1rwc6DmvfmkBrrHtKhwzUpf7aXHVNMLgKtt2tBUcXlFHhKzhJ6vn)

## Camadas

Application: Ponto inicial da aplicação.

Exemplo de repository:
Neste caso, por conta da interface UserRepository está herdando JpaRepository , não é necessário implementarmos os métodos, pois já está tudo contido dentro do JPA.

```
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
```
#### Exemplo de Service:

- Injetamos as dependências através do uso da annotation @Autowired.

- No método findAll( ) iremos retornar uma lista de User e retornamos usando o repository de User com o método vindo do JPA.

```
@Service
public class UserService {
```
```
@Autowired
private UserRepository repository;
```
```
public List<User> findAll() {
	return repository.findAll();
}
```
#### Exemplo de Resource:

```
@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}
}
```

## Relacionamentos

### Order e User:

- Muitos para um.

Usamos as anotações @JsonIgnore para controle de fluxo de dados, e @OneToMany para criar a relação

- @OneToMany recebe um parâmetro mappedBy que se refere ao client que está na classe Order.

- Na classe Order temos anotação "inversa" de @ManyToOne mas usamos apenas o @JoinColumn para juntar em Order o client em uma chave estrangeira de nome "client_id" que identifica a PK do User.


```

// User class

@JsonIgnore
@OneToMany(mappedBy = "client")
private List<Order> orders = new ArrayList<>();

// Order class

@ManyToOne
@JoinColumn(name = "client_id")
private User client;

```

### Product e Category:

- Muitos para muitos.

Para a criação desse relacionamento é necessário usarmos a anotação @ManyToMany , e @JoinTable para a criação da tabela intermediária entre essas duas entidades.

- @JoinTable recebe um parâmetro name que será o nome da tabela.

- Depois iremos utilizar o parâmetro joinColumns.

- Em joinColumns , usaremos então @JoinColumns para atribuir à aquela tabela uma coluna de nome "product_id".

- E chamaremos um outro parâmetro *inverseJoinColumns* , que irá receber um outro @JoinColumns , juntando a coluna de nome "category_id".

```
@ManyToMany
@JoinTable(name = "tb_product_category",
joinColumns = @JoinColumn(name = "product_id"),
inverseJoinColumns = @JoinColumn(name = "category_id"))
private Set<Category> categories = new HashSet<>();
```

### Order Item com Product e Order

- Muitos para muitos (com atributos extras)

No paradigma de POO, não temos o conceito de chave composto, por isso, é necessário a criação de uma classe auxiliar para armazenarmos o as informações de Product e Order.

Criamos então um package dentro de *entities* chamado de *pk*, que irá armazenar todas as classes que possuem o tipo de relacionamento citado acima.

Iremos construir a class OrderItemPK sem um construtor dessa forma:

```
@Embeddable
public class OrderItemPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
```

Tanto em *order* como *product*, temos que colocar as anotações *@ManyToOne* e *@JoinColumn* que serão o nome da tabela.
Depois fazemos os getters e setters dos dois atributos.

Dentro da classe OrderItem, iremos colocar como *id* principal, justamente a nossa classe *OrderItemPK*, já que é ela que possui a associação entre as duas tabelas.
```
@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();

    private Integer quantity;
    private Double price;

    public OrderItem () {}

    public OrderItem
    (
    Order order, Product product, Integer quantity, Double price
    ) 
    {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }
```

Vamos agora olhar mais de perto o que está acontecendo no construtor.

Estamos definindo que a classe *OrderItem* irá receber um *order* e *product* e dentro do construtor, chamamos o *id* do tipo *OrderItemPK* e acessamos o setter de ambos passando como argumento o atributo *order* e *product*.

Na classe *Order*, temos uma associação com muitos *items*, para isso, dentro dessa classe, devemos ter um **getItems** para acessarmos todos os *items* dos pedidos.

Então, iremos fazer uma associação de *@OneToMany*, com OrderItem (já que um pedido, possui muitos itens de pedido), acessando os pedidos por meio de *id.order*, já que é *id* da classe composto dentro da classe OrderItem que possui acesso aos pedidos.
```
// Order class

@OneToMany(mappedBy = "id.order")  
Set<OrderItem> items = new HashSet<>();


public Set<OrderItem> getItems() {  
    return items;  
}

```

Por temos uma associação de mão dupla, teremos que usar a anotação *@JsonIgnore* dentro da classe OrderItem, devemos então por essa anotação em *getOrder( )*, já que é ele que chama os pedidos.

```
// OrderItem class

@JsonIgnore
public Order getOrder() {
	return id.getOrder();
}

```

## Product e OrderItem

- Um para muitos

Para este relacionamento, da mesma forma que *Order* possui uma associação com uma lista de *OrderItem*:

```
// Order class

@OneToMany(mappedBy = "id.order")  
private Set<OrderItem> items = new HashSet<>();
```

Devemos impor na entidade *Product* a mesma associação, mapeando a partir da chave PK, sendo `id.order` as *orders* associadas a aquele produto.

```
// Product class

@OneToMany(mappedBy = "id.product")  
private Set<OrderItem> items = new HashSet<>();
```

Depois, temos que varrer a coleção de *items* para então pegar as *orders* associadas a este produto, fazemos criando um *getOrders, respeitando a nomenclatura do diagrama, e adicionamos cada *OrderItem* dentro da lista de Order do método, vejamos mais de perto como isso funciona:

```
@JsonIgnore
public Set<Order> getOrders() {  
    Set<Order> set = new HashSet<>();  
    for (OrderItem x : items) {  
       set.add(x.getOrder());  
    }  
  
    return set;  
}
```

Como a lista que estamos varrendo, é a de *items*, da qual a mesma está associada aos produtos, a lista *set* irá nos retornar todas as *orders* associadas aos produtos que buscarmos.

Apesar de não fazermos a utilização deste método na nossa aplicação final, é importante entender e possui-lo, já que futuramente ele possa vir a ser util.

## Payment e Order

- Um para um

Na associação entre um Payment, é possível vermos que um *Payment* pode ter uma *Order* e uma *Order* pode ter zero ou um (Especificado por 0..1) *Payment*.

Neste caso, existe uma dependência entre essas classes, sendo *Payment* a dependente de *Order*, no diagrama de classes e associações isso fica claro. 

Adicionaremos para fazer o mapeamento um para um, a anotação *@OneToOne*.

```
@OneToOne  
@MapsId
private Order order;
```


Do outro lado, em Order, vamos mapear com base no atributo de associação *order*, que está em *Payment* usando a mesma anotação *@OneToOne*:

```
@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)  
private Payment payment;
```

Ao utilizarmos a anotação @MapsId estamos especificando que nesta ocorrência, o *id* do *Payment*, vai ser igual ao *id* da *Order*, isso elimina a redundância de código, já que estamos removendo a necessidade se ter outro campo *id* para a entidade *Payment* dentro do banco de dados.
Já a propriedade *CascadeType.ALL*, identifica que a entidade *Payment* é o lado dependente, uma *Order* pode ser salva no banco sem um *Payment*, mas um *Payment* não pode ser salvo sem uma *Order*.

## Segurança:

A segurança da aplicação é feita baseada em um sistema de *roles*,  podendo um *User* ser um ADMIN ou um USER.

Um admin tem acesso a todas as rotas, podendo realizar todas as operações dentro da nosso API, já o USER, pode realizar apenas operações GET em certas rotas.

A autenticação é feita com um "login" e "password", já o registro é feito com ambas os campos, porém com a "role adicionada".
```
/auth/register

{
	"login": admin,
	"password:" 123456,
	"role": "ADMIN"
}
```

Uma coisa a se atentar é que embora o login possa ser feito por qualquer usuário, o registro fica disponível apenas para usuários ADMIN.

As senhas são encriptografadas com um encoder do BCrypt.

Já os tokens são gerados a partir do algoritmo HMAC256, que recebe um secret (contido em um arquivo .env local)

## Fluxo Geral com Segurança

1. **Application (Camada de Entrada)**: A aplicação recebe a requisição.
    
2. **Security Layer (Camada de Segurança)**:
    
    - A autenticação e a autorização são verificadas nesta etapa.
    - O sistema valida o token do usuário (caso ele esteja presente) e verifica as permissões com base nas _roles_ (`ADMIN` ou `USER`).
    - Se a autenticação ou autorização falhar, uma resposta de erro é retornada sem passar para as etapas seguintes.
    
1. **Resource Layer (Camada de Recursos)**:
    
    - Se a segurança estiver validada, a requisição é encaminhada aos controladores REST, que processam a requisição.
    
1. **Service Layer (Camada de Serviço)**:
    
    - Os controladores chamam a camada de serviço para executar a lógica de negócios.
    
1. **Data Access Layer (Camada de Acesso a Dados)**:
    
    - A camada de serviço interage com o repositório para buscar ou persistir dados, utilizando as entidades.
    
1. **Response**:
    
    - A resposta é devolvida ao cliente via camada `Resource Layer`, completando o ciclo.

### Fluxo Completo

**Application --> Security --> Resource (request) --> Service --> Repository --> Resource (response)**
