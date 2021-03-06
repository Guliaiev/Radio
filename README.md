Проект "Умный дом" развивается и было решено улучшить часть, отвечающую за Радио.

Что нужно сделать: внедрить изменения в сам класс и тесты.

Как это сделать:

Создайте в Git новую ветку: flexible (лучше брать проект своей предыдущей ДЗ, в который уже подключен CI и нужные плагины)
Модифицируйте тесты под новые требования: добавить/изменить/удалить (проверьте, что тесты не компилируются или просто падают, т.к. старый код не соответствует новым требованиям)
Внесите изменения в код (удостоверяетесь, что тесты теперь проходят)
Пушите всё на Github
Делаете Pull Request
Удостоверьтесь, что все тесты в CI запускаются на Pull Request и проходят
Ссылку на Pull Request пришлите в качестве результата ДЗ.

Требования к работе с радиостанциями:

Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
Номер текущей радиостанции изменяется в пределах от 0 до количества радиостанций, указанных при создании (см. п.1)
Если текущая радиостанция - максимальная, и клиент нажал на кнопку next (следующая) на пульте, то текущей должна стать 0-ая
Если текущая радиостанция - 0, и клиент нажал на кнопку prev (предыдущая) на пульте, то текущей должна стать максимальная
Клиент должен иметь возможность выставлять номер радиостанции с цифрового пульта (вводя числа 0 - количество станций)
Важно: один вызов метода переключения радиостанции должен приводить к переключению на единицу!

Требования к работе с уровнем громкости звука:

Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука (в пределах от 0 до 100)
Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на + не должно ни к чему приводить
Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на - не должно ни к чему приводить
Важно: один вызов метода должен приводить к переключению на единицу звука (если не достигнут min/max)!

Требования к проекту:

Подключите плагин Surefire так, чтобы сборка падала в случае отсутсвия тестов
Подключите плагин JaCoCo в режиме генерации отчётов (обрушать сборку по покрытию не нужно)
Реализуйте нужные классы и методы
Напишите автотесты на методы, содержащие логику, добившись 100% покрытия по branch'ам
Подключите CI на базе Github Actions и выложите всё на Github
Итого: у вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код и Pull Request.

Задача №2 - "Lombok"*
Важно: это необязательная задача. Её (не)выполнение не влияет на получение зачёта по ДЗ.

Легенда
Пришла пора разобраться с Lombok. В вашем личном кабинете прикреплено видео, где демонстрируется работа с Lombok.

Что нужно сделать:

Из ветки, созданной в предыдущем задании (flexible), создайте ветку lombok, в которой перепишите ваши data-class'ы с использование Lombok
Сделайте коммит и Pull Request на Github (удостоверьтесь, что CI успешно проводит сборку)
