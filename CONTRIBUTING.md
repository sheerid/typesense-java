# Contributing

Bug reports and pull requests are welcome on GitHub at https://github.com/typesense/typesense-java.


## Pull Request Process

Please note we have a code of conduct, please follow it in all your interactions with the project.

Before making a PR to this repository look out for the following guidelines.

## Guidelines for updating the client

- Download the latest api spec for typesense server from [typesense-api-spec](https://github.com/typesense/typesense-api-spec)
- Place file into the root of this repo and build with gradle

## Publishing

Publishing requires the presence of a `~/.gradle.properties` file:

```shell
signing.keyId=x1234567
signing.password=
signing.secretKeyRingFile=/Users/user/.gnupg/secring.gpg

sonatypeUsername=xxxxxx
sonatypePassword=
```

The `secring.gpg` file can be generated with:

```shell
gpg --keyring secring.gpg --export-secret-keys > ~/.gnupg/secring.gpg
```

```shell
./gradlew publishToSonatype closeAndReleaseSonatypeStagingRepository
```

