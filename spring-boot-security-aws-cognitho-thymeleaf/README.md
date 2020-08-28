
AWS Cognito steps to run this project:

1. Create AWS Cognito UserPool (default settings)
2. Create App Client (default settings)
3. Configure `App client settings`
3.1. Select `Cognito User Pool`
3.2. Set `Callback URL(s)` as `http://localhost:8080/login/oauth2/code/cognito`
3.3. Set `Sign out URL(s)` as `http://localhost:8080/logout`
3.4. Check `Authorization code grant`

4. Set `Domain name`
5. Create two groups: `ROLE_ADMIN` and `ROLE_USER`

6. Please write below properties to `config/application.properties` file:
`COGNITO_CLIENT_ID`
`COGNITO_CLIENT_SECRET`
`YOUR_REGION`
`YOUR_POOL_ID`

7. Start the application with `mvn spring-boot:run`
8. Visit http://localhost:8080/ and login
