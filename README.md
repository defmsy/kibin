![CI](https://github.com/defmsy/kibin/actions/workflows/ci.yml/badge.svg)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=defmsy_kibin&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=defmsy_kibin)

# kibin

## Configuration

| Configuration property      | Environment variable            | Description                          |
|-----------------------------|---------------------------------|--------------------------------------|
| app.security.oauth2.issuer-uri | APP_SECURITY_OAUTH2_ISSUER-URI  | OAuth2 Issuer Uri                    |
| app.security.oauth2.jwk-set-uri | APP_SECURITY_OAUTH2_JWK-SET-URI | OAuth2 JWT validation public key Uri |

## Development

### Local environment

To start a local environment, run the docker-compose dev/docker-compose.yaml

```bash
$ docker-compose -f dev/docker-compose.yml up -d
```

Configure the following environment variables to start the application locally.

| Environment variable            | Value                                                            |
|---------------------------------|------------------------------------------------------------------|
| APP_SECURITY_OAUTH2_ISSUER-URI  | http://localhost:9000/realms/kibin                               |
| APP_SECURITY_OAUTH2_JWK-SET-URI | http://localhost:9000/realms/kibin/protocol/openid-connect/certs |
