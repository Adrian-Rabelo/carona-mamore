# Carona Mamoré
---
API em desenvolvimento para a aplicação mobile/web que visa atender aos munícipes do estado de **Rondônia**

## TODO: criar um sumário para este README

## Um breve resumo :writing_hand:
---

Desde a criação da Uber, a forma de se locomover mudou drásticamente no âmbito mundial. Vemos também tecnologia semelhantes criadas diáriamente.

Porém, dificilmente vemos essas tecnologias em ação em locais ~~inóspitos~~ pequenos como interiores. Existem `N` fatores que contribuem para a escassez de empresas grandes investirem nessas áreas:
 - Densidade populacional baixa
   - não há motivos para empresa destinar os seus recursos para que apenas 30 ou 40 pessoas usem o produto.
 - Curta distância entre pontos de encontro
   - na maioria dos casos (digo isso por experiência), a distância de um ponto a outro é cerca de menos de 1km.
 - Custo alto para a população, dados os fatos anteriores
   - imagine uma empresa que aloca um pedaço do seu sistema num lugar em que pouca gente irá usar e, quando utilizar, será por um curto período. Faz um certo sentido que a empresa **eleve o custo de utilização** desse sistema para que se torne viável o seu uso naquele local.
---
## Por quê, então, criar uma cópia do que já existe? :thinking:
---
Ora, por que não?

Sendo sincero, ainda existem muitos pontos a se considerar. Mobile/Web mesmo? Por que não apenas mobile? Várias perguntas na minha cabecinha inexperiente

### Inexperiente
Essa palavra é o motivo de criar uma cópia. Transformar a minha inexperiência em experiência. Construir a minha aplicação, com a minha visão como consumidor de algo que existe e como desenvolvedor de algo que (ainda) não existe para o meu contexto, que é uma cidade pequena, cujos moradores necessitam de um transporte não local, mas entre cidades, e que o custo dessa "corrida" é extremamente elevado caso ele decida ir de ônibus. E relativamente burocrático caso decida ir com motoristas particulares.

## Custos e burocracia: o terror do brasileiro :skull:
---
Visto que temos no estado de Rondônia um certo monopólio nas empresas de transporte (deixa em off), o seu custo se torna elevado para munícipes que precisam se locomover diariamente ou 3 vezes na semana entre cidades. 

Para resolver o problema, ou, facilitar essa demanda, incrementando ainda com novos empregos (autônomos), munícipes decidiram pegar o próprio carro, publicar nas redes sociais que estão se locomovendo para `X` cidade e acordar um valor entre as pessoas que precisam ir para a cidade `X` e é isso. Uma nova profissão foi criada: um motorista "particular" sem a burocracia de ter que transformar o carro em táxi, trocar placa, instalar adesivos, etc.

### Um problema de cada vez: custo resolvido :heavy_check_mark:
O cenário funciona. Mas é o ideal? Observando, conversando, e experienciando o fluxo de "transporte particular" pude observar a evolução deste modelo de negócio. Uma única pessoa se tornou responsável por centralizar as "corridas". Ela é quem marca as corridas com os passageiros e com os motoristas. Inevitavelmente, isso elevou minimamente o custo da corrida, mas não vem ao caso.

Certo, agora, temos alguém organizando as corridas. Uma única pessoa se tornando o centro de uma organização cujo principal meio de comunicação é o WhatsApp. Onde isso poderia dar errado?

- Motoristas se recusando a viajar sem que seu carro estivesse completamente lotado
- Passageiros sendo surpreendidos com o valor final da corrida, o motorista se prontifica com um valor, mas a pessoa responsável por combinar a corrida, informa outro
- Confusão entre a pessoa organizadora e o motorista, ocasionando em um passageiro ser completamente esquecido e perder a viagem
- Cancelamentos de última hora entre passageiro e motorista
- Quando não há a pessoa centralizada responsável por organizar a corrida, há pouca confiança do passageiro para com o motorista.
- Quando há a confiança do passageiro com um único motorista, há a possível perda de comunicação entre ambos e um parte em viagem sem o outro
- Acredite se quiser: discussões calorosas e quase se tornando caso de polícia com a pessoa que organiza seus motoristas e com pessoas que simplesmente querem uma carona com alguém sem ter de necessariamente contatá-la :exploding_head:.

Dado então este cenário:
- Onde não fica exatamente claro quais são as regras, já que o principal meio de comunicação destas pessoas é um único aplicativo de mensagens
- Não há uma grande empresa com um grande aplicativo sendo responsável pela locomoção entre municípios,

Decidi organizar toda a transação deste mercado, criando um aplicativo que centralize toda a burocracia envolvendo a solicitação de uma corrida.

## Mas, como? :monocle_face:
---
Tentarei abstrair tudo o que se dificulta ao combinar corridas nessa relação passageiro-motorista, facilitando ambas as pontas do relacionamento. Ainda em fase de pensamento apenas, não há nem protótipo de como isso pode funcionar, nem modelo de negócio, muito menos patrocínio ou apoio para essa ideia, simplesmente decidi meter a cara e fazer. Isso vai me ajudar a desenvolver melhor minhas habilidades de programação e encher minha cabeça de conhecimentos necessários.
 
Registrarei todas as fases do projeto e cada decisão tomada utilizando as [milestones](https://github.com/oadrianrabelo/carona-mamore/milestones) e o próprio README também. As linguagens e regras do projeto serão definidos conforme a criação dele, já que não tenho uma equipe para pensar em cada detalhe, cada linha, cada regra de negócio. Mas posso separar em pequenas partes. Facilitando a minha vida e não criando um monstro gigante na qual eu ficarei preso, sem saída e acabo desistindo do projeto;

## Escopo inicial do projeto

O Sistema deve conter cadastro de dois tipos de usuário: motorista e passageiro. Ou seja, já podemos identificar logo de cara, um sistema de autenticação

- [ ] Criar sistema de autenticação

### Motorista
Deve criar sua própria conta, sendo uma conta por CPF (sim, esse nível de dados sensíveis para evitar possíveis [problemas](#-carona-mamoré)). Ou seja:

- [ ] Criar tela de cadastro do motorista
  - Deve constar **OBRIGATORIAMENTE**
    - [ ] Nome
    - [ ] CPF
    - [ ] RG
    - [ ] Data de nascimento
    - [ ] CNH
    - [ ] Dados do carro (modelo, placa, cor)
    - [ ] Contato (celular, preferencialmente WhatsApp)
    - [ ] E-mail
    - [ ] Foto

### Passageiro
- [ ] Criar tela de cadastro do passageiro
   - Deve constar **OBRIGATORIAMENTE**
      - [ ] Nome
      - [ ] CPF
      - [ ] RG
      - [ ] Data de nascimento
      - [ ] CNH
      - [ ] Contato (celular, preferencialmente WhatsApp)
      - [ ] E-mail
      - [ ] Foto
      - [ ] Endereço

Estes dois são os principais atores do sistema, que podem ser evoluídos de diversas maneiras. Mas estes me parecem ser os dados essenciais para o funcionamento do projeto. Agora, precisamos separar o **sistema** em features essenciais para seu funcionamento e features diferenciais do sistema que o tornarão "único" em sua essência

### Features essenciais:
- [ ] Sistema que deve combinar a corrida entre os dois atores (**WIP**: elaborar mais essa idéia)
- [ ] Sistema de chat entre os atores do sistema
- [ ] Sistema para abrir um aplicativo de mapa que destina o motorista até a casa do passageiro
- [ ] Feedback de ambos os atores em relação ao aplicativo.
- [ ] Sistema de Logger para armazenar e catalogar todas as transações do aplicativo, desde a solicitação de uma corrida até conversas no chat entre os atores. [isso é realmente válido ou estou overthinking?](#-carona-mamoré)

### Features diferenciais do sistema:
- [ ] Sistema de avaliação para motorista
- [ ] Sistema de avaliação para passageiro