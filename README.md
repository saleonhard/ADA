# ADA - Agenda Digital Acadêmica (2015)

Bem-vindo ao projeto **ADA - Agenda Digital Acadêmica**! 📚✨ Este projeto foi desenvolvido como parte do meu curso técnico em informática e tem como objetivo facilitar a organização de tarefas e compromissos acadêmicos para estudantes.

![image](https://github.com/user-attachments/assets/62f6b243-a72b-424c-a31d-519a2d049db8)
![image](https://github.com/user-attachments/assets/f4c82a8d-52be-4d38-b559-c9a4868c7f37)


## Descrição do Projeto

A **ADA** é uma aplicação desktop que permite aos usuários gerenciar suas atividades escolares, como aulas, trabalhos e prazos de entrega. Com uma interface amigável e recursos práticos, a ADA visa melhorar a produtividade e o gerenciamento do tempo dos alunos. 💻

> **Nota:** Nem todas as funcionalidades foram implementadas, mas a base do sistema já está em funcionamento e pronto para futuras expansões.

## Estrutura do Projeto

O projeto é organizado nas seguintes camadas:

- **DAO (Data Access Object)**: Responsável pela interação com o banco de dados, encapsulando as operações de CRUD (criação, leitura, atualização e exclusão) para cada entidade. 🗄️
  
- **Entidades**: Representam os dados do sistema. As principais entidades são:
  - **Discente**: Representa os estudantes do sistema.
  - **Docente**: Representa os professores.
  - **Gerente**: Representa os administradores do sistema.
  - **Materias**: Representa as disciplinas oferecidas.
  - **Turmas**: Representa as classes dos alunos. 

- **Imagens**: Contém recursos visuais utilizados na aplicação, como ícones e logotipos. 🖼️

- **Views**: Responsáveis pela interface do usuário, onde as interações ocorrem. Cada view é projetada para facilitar a usabilidade e a navegação. 📊

## Funcionalidades

- **Cadastro de Entidades**: Permite o registro de discentes, docentes e gerentes.
- **Login**: Sistema de autenticação para acesso seguro à aplicação. 🔑
- **Alteração de Senha**: Opção para os usuários atualizarem suas senhas quando necessário. 🔄



## Tecnologias Utilizadas

- **Linguagem**: Java
- **Framework**: Swing
- **Banco de Dados**: MySQL


## Como Executar

Para executar o projeto localmente, siga os passos abaixo:

1. Clone o repositório:
   ```bash
   git clone https://github.com/saleonhard/ADA.git
   cd ADA
2. Certifique-se de ter o JDK instalado e o MySQL configurado.

3. Compile e execute o projeto em sua IDE favorita (como Eclipse ou IntelliJ).

4. Acesse a aplicação e comece a organizar suas tarefas!

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests. Juntos, podemos aprimorar a ADA! 🤝
