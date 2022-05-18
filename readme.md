## Порядок установки
1. Переключить хуки на директорию из репозитория
```shell
git config --local core.hooksPath .githooks/
```

2. Добавить свойство
```xml
    <properties>
        ...
        <buildTime>${maven.build.timestamp}</buildTime>
        <maven.build.timestamp.format>dd.MM.yyyy_HH.mm.ss</maven.build.timestamp.format>
    </properties>
```

3. Добавить в application.properties
```properties
buildTime=@buildTime@
```

4. Перенести класс BuildTimeReader


6. в main классе добавить
```java
public static void main(String[] args){
        if(args.length==1 && "-v".equals(args[0])){
            BuildTimeReader.printBuildTime(args);
            return;
        }
        ...
}
```