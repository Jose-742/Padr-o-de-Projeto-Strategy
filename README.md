# Padrões de Projeto - Strategy com Template Method
"Strategy com Template Method" é um padrão de projeto (design pattern) em Java que combina o uso dos padrões "Strategy" e "Template Method".

O padrão "Strategy" é usado quando queremos definir uma família de algoritmos e encapsular cada um deles para torná-los intercambiáveis. Isso permite que o cliente selecione a implementação que melhor se adequa à sua necessidade.

O padrão "Template Method" é usado quando queremos definir a estrutura básica de um algoritmo, deixando alguns detalhes específicos para serem implementados pelas subclasses. Isso permite que a estrutura básica do algoritmo seja definida uma única vez e que as subclasses possam reutilizá-la e personalizá-la de acordo com suas necessidades.

Ao combinar esses dois padrões, podemos ter uma estrutura básica de algoritmo que pode ser personalizada com diferentes estratégias. O Template Method define a estrutura geral do algoritmo, enquanto o Strategy define as diferentes implementações específicas desse algoritmo.

Por exemplo, imagine que você está desenvolvendo um jogo de estratégia e precisa implementar diferentes estratégias para o comportamento dos soldados em combate. Com o padrão "Strategy com Template Method", você pode definir uma classe abstrata Soldado que implementa o Template Method para o combate, deixando algumas etapas específicas para as subclasses implementarem. Em seguida, você pode definir diferentes classes concretas que implementam a interface Strategy e personalizam o comportamento de combate dos soldados de acordo com suas habilidades e características.

Assim, quando o cliente quiser usar um determinado comportamento de combate, ele pode selecionar a implementação adequada da Strategy e o Soldado utilizará o comportamento personalizado correspondente.
