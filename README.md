# Barbershop 💈

Sistema de gerenciamento para barbearias desenvolvido em **Java Swing** com interface desktop. Desenvolvido no **NetBeans**, o sistema é voltado para três perfis de usuários, permitindo agendamentos, controle de serviços e relatórios detalhados.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Java_Swing-6DB33F?style=for-the-badge)
![NetBeans](https://img.shields.io/badge/NetBeans-0078BD?style=for-the-badge&logo=apache-netbeans&logoColor=white)

---

## 📹 Demonstração

---

## 🖥️ Funcionalidades

### Administrador
- Visualiza todos os agendamentos.  
- Acessa relatórios detalhados da barbearia.  
- Gerencia usuários e informações do sistema.

### Recepcionista
- Efetua agendamentos de clientes.  
- Realiza cadastros de clientes.  
- Gerencia informações básicas de atendimento.

### Barbeiro
- Visualiza sua agenda de atendimentos.  
- Confirma ou acompanha os serviços agendados.

### Recursos adicionais
- Envio automático de e-mail para clientes confirmando o agendamento.

---

## ⚙️ Tecnologias Utilizadas
- **Java SE**  
- **Java Swing** para interface gráfica  
- **NetBeans IDE**  
- **JavaMail** para envio de e-mails  

---

## 📥 Pré-requisitos
- Java 8 ou superior  
- IDE NetBeans (opcional)  
- Conta de e-mail configurada para envio de confirmações  

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/edufr0/Barbershop.git
2. Abra o projeto no NetBeans.
3. Compile e execute a classe principal (Main ou equivalente).
4. Faça login com um dos usuários para acessar as funcionalidades.

## 📧 Configuração do E-mail

- Configure os dados do servidor SMTP na classe responsável pelo envio de e-mails.

- Use credenciais válidas do e-mail que enviará as confirmações.

## 👥 Usuários Padrão (para testes)
| Usuário       | Login      | Senha       |
|:-------------:|:---------:|:-----------|
| Administrador | admin     | admin123   |
| Recepcionista | recep     | recep123   |
| Barbeiro      | barbeiro  | barbeiro123 |


## 📊 Estrutura do Projeto
```
Barbershop/
│
├─ src/ # Código-fonte em Java
├─ lib/ # Bibliotecas externas (ex.: JavaMail)
├─ README.md # Este arquivo
└─ pom.xml # Configuração Maven (se aplicável)
```

## 🔧 Melhorias Futuras

- Integração com banco de dados real (MySQL, PostgreSQL)

- Interface gráfica mais moderna

- Envio de notificações por SMS

- Relatórios avançados com gráficos

## 🤝 Contribuição

1. Contribuições são bem-vindas!

2. Faça um fork do projeto

3. Crie sua feature branch (git checkout -b feature/nova-funcionalidade)

4. Faça commit das alterações (git commit -m 'Adicionar nova funcionalidade')

5. Push para a branch (git push origin feature/nova-funcionalidade)

6. Abra um Pull Request


