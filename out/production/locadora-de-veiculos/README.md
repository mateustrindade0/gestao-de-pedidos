# 🚀 Guia do Projeto — Sistema de Locadora de Veículos
Bem-vindo ao projeto da Locadora de Veículos!

# 🧱 📂 Estrutura do Projeto
```
locadora-de-veiculos/
├── src/
│   ├── Main.java                → Início do sistema (menu principal)
│   ├── models/                  → Classes de dados (Cliente, Veiculo, etc.)
│   ├── dao/                     → Acesso ao banco (CRUD via JDBC)
│   ├── services/                → Regras de negócio
│   ├── ui/                      → Menus e interação via terminal
│   ├── utils/                   → Funções auxiliares (datas, logs, validações)
│   └── database/                → Conexão JDBC (MySQL XAMPP)
├── database/                    → Scripts SQL para criar o banco
└── libs/                        → Driver JDBC (mysql-connector)
```

# ⚙️ Como configurar o ambiente
# 🔗 1️⃣ Instalar os programas necessários:
Java JDK 17+
XAMPP (para o banco MySQL local)
VS Code ou IntelliJ IDEA
Git (https://git-scm.com/downloads)

# 🧩 2️⃣ Clonar o repositório
Abra o terminal e digite:
```
git clone https://github.com/SEU_USUARIO/locadora_project.git
```
Isso vai baixar o projeto na sua máquina.

# 🧠 3️⃣ Criar uma branch pessoal
Cada integrante deve trabalhar em sua própria branch:
```
git checkout -b nome-do-integrante
```

Exemplo:
```
git checkout -b mateus
```

# ✏️ 4️⃣ Fazer alterações
Abra o projeto e edite os arquivos que você for responsável.
Após salvar, adicione e envie as mudanças:

```
git add .
git commit -m "mensagem explicando o que foi feito"
git push origin nome-da-sua-branch
```

*💡 Exemplo:*
```
git commit -m "Adicionei classe Cliente e método listar()"
git push origin mateus
```

# 🔁 5️⃣ Atualizar seu projeto (puxar novas alterações)
Antes de continuar trabalhando:
```
git pull origin main
```
Isso mantém seu projeto sincronizado com o grupo.

# 🤝 6️⃣ Criar um Pull Request
Quando terminar sua parte:
1. Vá no repositório no GitHub
2. Clique em “Compare & pull request”
3. Descreva o que fez e clique em “Create pull request”
O revisor do grupo vai verificar e aprovar.

# ⚠️ Dicas importantes
- Nunca edite diretamente a branch main
- Sempre puxe as alterações antes de editar
- Escreva mensagens claras nos commits
- Combine com o grupo quem revisa e quem faz merge

# ✅ Checklist inicial

- Instalar Java e Git
- Clonar repositório
- Criar branch pessoal
- Rodar Main.java e testar conexão
- Começar a implementar sua parte 🚀

*🧠 Dica:* Se algo quebrar, peça ajuda antes de dar git push.
Use git status para ver o que foi alterado.
