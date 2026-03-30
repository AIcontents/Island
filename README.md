# Симуляция Острова

Дискретная по времени, основанная на сетке симуляция экосистемы изолированного острова. Это приложение на основе Java моделирует жизненные циклы и взаимодействия различных видов животных и растений. Каждый организм на острове следует набору правил для таких действий, как перемещение, еда, размножение и смерть, создавая динамичный и развивающийся виртуальный мир.

## Основные Концепции

-   **Сетка Острова**: Мир представляет собой 2D-сетку, где каждая ячейка представляет отдельное местоположение.
-   **Организмы**: Симуляция населена различными типами организмов, включая хищников, травоядных и растения.
-   **Жизненный Цикл**: Симуляция проходит в дискретных временных шагах, или "циклах". В каждом цикле каждый организм получает возможность выполнять действия на основе своего внутреннего состояния и окружающей среды.
-   **Взаимодействия**: Организмы могут взаимодействовать друг с другом. Например, хищники охотятся на травоядных, а травоядные потребляют растения.

## Обитатели Острова

Остров населен разнообразными видами, каждый со своими уникальными характеристиками.

### Хищники
Это плотоядные животные, которые охотятся на других животных (в основном, на травоядных).

| Вид | Вес (кг) | Макс. кол-во в ячейке | Скорость (ячеек/цикл) | Необх. еды для насыщения (кг) |
| :----------- | :---: | :---: | :---: | :---: |
| **Волк** | 50 | 30 | 3 | 8 |
| **Удав** | 15 | 30 | 1 | 3 |
| **Лиса** | 8 | 30 | 2 | 2 |
| **Медведь** | 500 | 5 | 2 | 80 |
| **Орел** | 6 | 20 | 3 | 1 |

### Травоядные
Это животные, которые питаются растениями.

| Вид | Вес (кг) | Макс. кол-во в ячейке | Скорость (ячеек/цикл) | Необх. еды для насыщения (кг) |
| :----------- | :---: | :---: | :---: | :---: |
| **Лошадь** | 400 | 20 | 4 | 60 |
| **Олень** | 300 | 20 | 4 | 50 |
| **Кролик** | 2 | 150 | 2 | 0.45 |
| **Мышь** | 0.05 | 500 | 1 | 0.01 |
| **Коза** | 60 | 140 | 3 | 10 |
| **Овца** | 70 | 140 | 3 | 15 |
| **Кабан** | 400 | 50 | 2 | 50 |
| **Буйвол** | 700 | 10 | 3 | 100 |
| **Утка** | 1 | 200 | 4 | 0.15 |

### Растения
Растения служат основным источником пищи для травоядных.

| Вид | Вес (кг) | Макс. кол-во в ячейке |
| :----------- | :---: | :---: |
| **Трава** | 1 | 200 |

## Структура Проекта

Проект состоит из нескольких классов, которые работают вместе для создания симуляции.

-   **\`Симуляция\`**: Основной класс, который управляет симуляцией. Он содержит игровой цикл и управляет состоянием симуляции.
-   **\`Остров\`**: Представляет сетку острова и содержит коллекцию объектов \`Местоположение\`.
-   **\`Местоположение\`**: Представляет одну ячейку на острове и содержит организмы, находящиеся в этой ячейке.
-   **\`Организм\`**: Абстрактный базовый класс для всех живых существ в симуляции.
-   **\`Животное\`** и **\`Растение\`**: Абстрактные подклассы \`Организма\`, которые представляют животных и растения соответственно.
-   **\`Хищник\`** и **\`Травоядное\`**: Абстрактные подклассы \`Животного\` для плотоядных и травоядных животных.
-   **Конкретные Классы Животных** (например, \`Волк\`, \`Лошадь\`, \`Кролик\`): Каждый класс расширяет \`Хищника\` или \`Травоядное\` и определяет специфическое поведение и атрибуты для этого животного.

## Тестирование

Проект включает в себя набор модульных и функциональных тестов для обеспечения правильности логики симуляции.

## Результаты тестов
```text
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ demo ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ demo ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ demo ---
[INFO] skip non existing resourceDirectory /home/user/island/src/test/resources
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ demo ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- surefire:3.1.2:test (default-test) @ demo ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.example.demo.SimulationFunctionalTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.190 s -- in com.example.demo.SimulationFunctionalTest
[INFO] Running com.example.demo.IslandTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.070 s -- in com.example.demo.IslandTest
[INFO] Running com.example.demo.AnimalTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.036 s -- in com.example.demo.AnimalTest
[INFO] Running com.example.demo.LocationTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.063 s -- in com.example.demo.LocationTest
[INFO] Running com.example.demo.DemoApplicationTests
11:58:58.734 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.example.demo.DemoApplicationTests]: DemoApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
11:58:59.081 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.example.demo.DemoApplication for test class com.example.demo.DemoApplicationTests
11:58:59.310 [main] INFO org.springframework.boot.devtools.restart.RestartApplicationListener -- Restart disabled due to context in which it is running

  .   ____          _            __ _ _
 /\\\\ / ___\'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\
( ( )\\___ | \'_ | \'_| | \'_ \\/ _` | \\ \\ \\ \\
 \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  \'  |____| .__|_| |_|_| |_\\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.1)

2026-03-30T11:58:59.883Z  INFO 3685 --- [demo] [           main] com.example.demo.DemoApplicationTests    : Starting DemoApplicationTests using Java 19.0.2 with PID 3685 (started by user in /home/user/island)
2026-03-30T11:58:59.888Z  INFO 3685 --- [demo] [           main] com.example.demo.DemoApplicationTests    : No active profile set, falling back to 1 default profile: "default"
2026-03-30T11:59:03.354Z  INFO 3685 --- [demo] [           main] com.example.demo.DemoApplicationTests    : Started DemoApplicationTests in 4.059 seconds (process running for 7.152)
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.757 s -- in com.example.demo.DemoApplicationTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 13, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  14.362 s
[INFO] Finished at: 2026-03-30T11:59:06Z
[INFO] ------------------------------------------------------------------------
```
