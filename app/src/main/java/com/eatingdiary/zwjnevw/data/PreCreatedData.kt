package com.eatingdiary.zwjnevw.data

import com.eatingdiary.zwjnevw.R
import com.eatingdiary.zwjnevw.data.food.FoodData
import com.eatingdiary.zwjnevw.data.food.generateUniqueID
import com.eatingdiary.zwjnevw.data.workout.CardioExercise
import com.eatingdiary.zwjnevw.data.workout.StrengthExercise
import com.eatingdiary.zwjnevw.data.workout.WorkoutCategory
import java.time.Duration

val PreCreatedCategoryList = listOf(
    WorkoutCategory(0, "Грудные мышцы", mutableListOf(
        StrengthExercise(name = "Жим в тренажере", 0, 0, 0),
        StrengthExercise(name = "Жим гантелей лежа на спине", 0, 0, 0),
        StrengthExercise(name = "Жим лежа в скамье Шмита", 0, 0, 0),
        StrengthExercise(name = "Жим гантелей лежа на скамье с положительным наклоном хватом \"молоток\"", 0, 0, 0),
        StrengthExercise(name = "Жим гантелей лежа на скамье с положительным наклоном", 0, 0, 0),
        StrengthExercise(name = "Жим гири лежа одной рукой", 0, 0, 0),
        StrengthExercise(name = "Жим лежа на скамье с эспандером", 0, 0, 0),
        StrengthExercise(name = "Жим с гантелями лежа на наклонной скамье", 0, 0, 0),
        StrengthExercise(name = "Кроссовер с эспандером", 0, 0, 0),
        StrengthExercise(name = "Наклонный жим в тренажере", 0, 0, 0),
        StrengthExercise(name = "Отжимания", 0, 0, 0),
        StrengthExercise(name = "Отжимания с поднятыми ногами", 0, 0, 0),
        StrengthExercise(name = "Отжимания с широким упором на руки", 0, 0, 0),
        StrengthExercise(name = "Отжимания с узким упором на руки", 0, 0, 0),
        StrengthExercise(name = "Жим лежа широким хватом", 0, 0, 0),
        StrengthExercise(name = "Жим лежа широким хватом на скамье с отрицательным наклоном", 0, 0, 0),
        StrengthExercise(name = "Отведение гантелей через стороны лежа", 0, 0, 0),
        StrengthExercise(name = "Отжимания на одной руке", 0, 0, 0),
        StrengthExercise(name = "Пуловер с гантелей лежа на скапье", 0, 0, 0),
        StrengthExercise(name = "Пуловер и подъем", 0, 0, 0),
        StrengthExercise(name = "Пуловер со штангой лежа на наклонной скамье", 0, 0, 0),
        StrengthExercise(name = "Сведение рук в кроссовере", 0, 0, 0),
        StrengthExercise(name = "Сведение рук на нижнем блоке лежа", 0, 0, 0),
        StrengthExercise(name = "Сведение рук в тренажере (Бабочка)", 0, 0, 0),
        StrengthExercise(name = "Жим Свенда", 0, 0, 0),
        StrengthExercise(name = "Плиометрические отжимания", 0, 0, 0),
        StrengthExercise(name = "Статическое упражнение для мышц груди", 0, 0, 0),
        StrengthExercise(name = "Жим с цепью лежа", 0, 0, 0),
        StrengthExercise(name = "Плиометрические отжимания с гирей", 0, 0, 0),
    ), R.drawable.chest),
    WorkoutCategory(1, "Руки", mutableListOf(
        StrengthExercise(name = "Сгибание рук на бицепц на верхнем блоке", 0, 0, 0),
        StrengthExercise(name = "Сгибание рук на бицепц со штангой, с отведением локтей назад", 0, 0, 0),
        StrengthExercise(name = "Концентрированные сгибания на бицепс сидя", 0, 0, 0),
        StrengthExercise(name = "Подъем EZ-штанги на бицепс на скамье Скотта", 0, 0, 0),
        StrengthExercise(name = "Подъем EZ-штанги на бицепс стоя (узкий хват)", 0, 0, 0),
        StrengthExercise(name = "Жим штанги на бицепс", 0, 0, 0),
        StrengthExercise(name = "Сгибания рук со гантелями", 0, 0, 0),
        StrengthExercise(name = "Отжимания на брусьях", 0, 0, 0),
        StrengthExercise(name = "Молотковый подъем", 0, 0, 0),
        StrengthExercise(name = "Упражнение \"Бритва\"", 0, 0, 0),
        StrengthExercise(name = "Подъем гантелей на бицепс сидя", 0, 0, 0),
        StrengthExercise(name = "Подъем гантелей на бицепс стоя", 0, 0, 0),
        StrengthExercise(name = "Подъем гантелей на бицепс через стороны сидя", 0, 0, 0),
        StrengthExercise(name = "Подъем на бицепс на нижнем блоке", 0, 0, 0),
        StrengthExercise(name = "Подъем штанги на бицепс", 0, 0, 0),
        StrengthExercise(name = "Подъем штанги на бицепс на наклонной скамье", 0, 0, 0),
        StrengthExercise(name = "Поочередное сгибание рук на бицепс сидя на наклонной скамье", 0, 0, 0),
        StrengthExercise(name = "Сгибание одной рукой на бицепс на скамье Скотта", 0, 0, 0),
        StrengthExercise(name = "Сгибание рук на бицепс на нижнем блоке (с канатной рукоятью)", 0, 0, 0),
        StrengthExercise(name = "Сгибание рук на бицепс на нижнем блоке обратным хватом", 0, 0, 0),
        StrengthExercise(name = "Сгибание рук на бицепс с диском", 0, 0, 0),
        StrengthExercise(name = "Подъем гантелей на бицепс в наклоне", 0, 0, 0),
        StrengthExercise(name = "Сгибания Зоттмана", 0, 0, 0),
        StrengthExercise(name = "Сгибания Зоттмана на скамье Скотта", 0, 0, 0),
        StrengthExercise(name = "JM-жим", 0, 0, 0),
        StrengthExercise(name = "Жим лежа узким хватом в машине Смита", 0, 0, 0),
        StrengthExercise(name = "Жим штанги лежа узким хватом", 0, 0, 0),
        StrengthExercise(name = "Отжимания от скамьи из-за спины", 0, 0, 0),
        StrengthExercise(name = "Жим одной рукой в положении лежа", 0, 0, 0),
        StrengthExercise(name = "Комплексное упражнение на трицепс на наклонной скамье", 0, 0, 0),
        StrengthExercise(name = "Обратный жим лежа на скамье", 0, 0, 0),
        StrengthExercise(name = "Отжимания (ладони узко)", 0, 0, 0),
        StrengthExercise(name = "Жим одной рукой в тресовом тренажере", 0, 0, 0),
        StrengthExercise(name = "Разгибание гантелей назад", 0, 0, 0),
        StrengthExercise(name = "Разгибание на трицепс вниз на блоке, используя канатную рукоять", 0, 0, 0),
        StrengthExercise(name = "Разгибание на трицепс обратным хватом", 0, 0, 0),
        StrengthExercise(name = "Тяга канатной рукоятью из-за спины", 0, 0, 0),
        StrengthExercise(name = "Французский жим на нижнем блоке", 0, 0, 0),
        StrengthExercise(name = "Французский жим со штангой стоя", 0, 0, 0),
        StrengthExercise(name = "Жим Тейта", 0, 0, 0),
        StrengthExercise(name = "Жим штанги ко лбу узким хватом", 0, 0, 0),
        StrengthExercise(name = "Подъем и удержание гири перед собой", 0, 0, 0),
        StrengthExercise(name = "Сгибание запястий на нижнем блоке", 0, 0, 0),
        StrengthExercise(name = "Сгибание запястий на скамье с гантелями ладонями вниз", 0, 0, 0),
        StrengthExercise(name = "Сгибание запястий на скамье с гантелями ладонями вверх", 0, 0, 0),
        StrengthExercise(name = "Удерживание веса", 0, 0, 0),
        StrengthExercise(name = "Сгибание запястья сидя на скамье супинированным хватом", 0, 0, 0),
    ), R.drawable.arms),
    WorkoutCategory(2, "Плечи", mutableListOf(
        StrengthExercise(name = "Жим плечами лежа на скамье", 0, 0, 0),
        StrengthExercise(name = "Армейский жим стоя", 0, 0, 0),
        StrengthExercise(name = "Жим сидя в тренажере", 0, 0, 0),
        StrengthExercise(name = "Жим стоя с эспандером", 0, 0, 0),
        StrengthExercise(name = "Комплексный жим штанги сидя", 0, 0, 0),
        StrengthExercise(name = "Жим гантелей от Арнольда Шварцнегера", 0, 0, 0),
        StrengthExercise(name = "Жим гантелей сидя", 0, 0, 0),
        StrengthExercise(name = "Жим гантелей стоя", 0, 0, 0),
        StrengthExercise(name = "Жим гири одной рукой", 0, 0, 0),
        StrengthExercise(name = "Жим гирь над собой", 0, 0, 0),
        StrengthExercise(name = "Жим штанги сидя", 0, 0, 0),
        StrengthExercise(name = "Жим штанги стоя из-за головы", 0, 0, 0),
        StrengthExercise(name = "Комплексный жим гантелей", 0, 0, 0),
        StrengthExercise(name = "Кубинский жим", 0, 0, 0),
        StrengthExercise(name = "Попеременный жим ширь стоя", 0, 0, 0),
        StrengthExercise(name = "Отжимания стоя на руках", 0, 0, 0),
        StrengthExercise(name = "Вертикальная тяга штанги к груди стоя", 0, 0, 0),
        StrengthExercise(name = "Махи руками с эспандером", 0, 0, 0),
        StrengthExercise(name = "Тяга к шее в гребном тренажере", 0, 0, 0),
        StrengthExercise(name = "Тяга штанги к груди в наклоне стоя", 0, 0, 0),
        StrengthExercise(name = "Подъем гирь на плечи", 0, 0, 0),
        StrengthExercise(name = "Тяга к лицу в тросовом тренажере", 0, 0, 0),
        StrengthExercise(name = "Рывок гирь", 0, 0, 0),
        StrengthExercise(name = "Рывок гири одной рукой", 0, 0, 0),
        StrengthExercise(name = "Жим гантелей плечами на наклонной скамье", 0, 0, 0),
        StrengthExercise(name = "Подъем гантелей перед собой", 0, 0, 0),
        StrengthExercise(name = "Подъем гантели одной рукой в сторону", 0, 0, 0),
        StrengthExercise(name = "Подъем рук перед собой в тросовом тренажере", 0, 0, 0),
        StrengthExercise(name = "Разведение рук в стороны с гантелями перед собой", 0, 0, 0),
        StrengthExercise(name = "Подъем гантелей над головой", 0, 0, 0),
        StrengthExercise(name = "Разведение рук в стороны в нижнем блоке", 0, 0, 0),
        StrengthExercise(name = "Разведение рук с гантелями в упоре", 0, 0, 0),
        StrengthExercise(name = "Разведение гантелей в стороны лежа головой вниз", 0, 0, 0),
    ), R.drawable.shoulders),
    WorkoutCategory(3, "Ноги", mutableListOf(
        StrengthExercise(name = "Приседание со штангой на плечах", 0, 0, 0),
        StrengthExercise(name = "Становая тяга с гантелями", 0, 0, 0),
        StrengthExercise(name = "Становая тяга со штангой", 0, 0, 0),
        StrengthExercise(name = "Становая тяга с гирей стоя на одной ноге", 0, 0, 0),
        StrengthExercise(name = "Сгибание ног в тренажере лежа", 0, 0, 0),
        StrengthExercise(name = "Сгибание ног в тренажере стоя", 0, 0, 0),
        StrengthExercise(name = "Сгибание ног на фитболе", 0, 0, 0),
        StrengthExercise(name = "\"Доброе утро\"", 0, 0, 0),
        StrengthExercise(name = "Подъем штанги на грудь", 0, 0, 0),
        StrengthExercise(name = "Сведение ног в тренажере", 0, 0, 0),
        StrengthExercise(name = "Выпады с гантелями", 0, 0, 0),
        StrengthExercise(name = "Боковые выпады со штангой", 0, 0, 0),
        StrengthExercise(name = "Приседания в машине Смита", 0, 0, 0),
        StrengthExercise(name = "Глубокие приседания со штангой", 0, 0, 0),
        StrengthExercise(name = "Приседания со штангой за спиной", 0, 0, 0),
        StrengthExercise(name = "Приседания с эспандером", 0, 0, 0),
        StrengthExercise(name = "Выпады назад с гантелями", 0, 0, 0),
        StrengthExercise(name = "Жим ногами в узкой постановке стоп", 0, 0, 0),
        StrengthExercise(name = "Заход на скамью с гантелями", 0, 0, 0),
        StrengthExercise(name = "Заход на скамью со штангой", 0, 0, 0),
        StrengthExercise(name = "Приседания Джефферсона", 0, 0, 0),
        StrengthExercise(name = "Приседания с отягощением", 0, 0, 0),
        StrengthExercise(name = "Прыжки с приседаниями", 0, 0, 0),
        StrengthExercise(name = "Приседания Зерхера", 0, 0, 0),
        StrengthExercise(name = "Приседания с гирей над головой", 0, 0, 0),
        StrengthExercise(name = "Сисси-приседы", 0, 0, 0),
        StrengthExercise(name = "Выпрямление ног в тренажере", 0, 0, 0),
        StrengthExercise(name = "Подъем икр с гантелей сидя", 0, 0, 0),
        StrengthExercise(name = "Подъем на носки в тренажере для жима ногами", 0, 0, 0),
        StrengthExercise(name = "Подъем на носки со штангой стоя", 0, 0, 0),
        StrengthExercise(name = "Подъем на носки со штангой сидя", 0, 0, 0),
        StrengthExercise(name = "Попеременный поъем на пятки и на носки со штангой", 0, 0, 0),
        StrengthExercise(name = "Подъем ягодиц (Мост)", 0, 0, 0),
        StrengthExercise(name = "Подъем ягодиц со Штангой", 0, 0, 0),
        StrengthExercise(name = "Приседания стоя на коленях", 0, 0, 0),
        StrengthExercise(name = "Подъём ягодиц со штангой опираясь на скамью", 0, 0, 0),
        CardioExercise(name = "Бег на беговой дорожке", Duration.ZERO),
        CardioExercise(name = "Езда на велосипеде", Duration.ZERO),
        CardioExercise(name = "Езда на велотренажере", Duration.ZERO),
        CardioExercise(name = "Ходьба на беговой дорожке", Duration.ZERO),
        CardioExercise(name = "Ходьба на улице", Duration.ZERO),
        CardioExercise(name = "Бег на улице", Duration.ZERO),
        CardioExercise(name = "Прыжки через скакалку", Duration.ZERO),
        CardioExercise(name = "Прыжки", Duration.ZERO),
    ), R.drawable.legs),
    WorkoutCategory(4,"Спина", mutableListOf(
        StrengthExercise(name = "Вертикальная тяга гантелей к груди", 0, 0, 0),
        StrengthExercise(name = "Тяга к груди с эспандером", 0, 0, 0),
        StrengthExercise(name = "Тяга штанги к груди в машине Смита", 0, 0, 0),
        StrengthExercise(name = "Вертикальная тяга к груди нижнего блока", 0, 0, 0),
        StrengthExercise(name = "Тяга к груди в стиле Сумо", 0, 0, 0),
        StrengthExercise(name = "Шраги в машине Смита", 0, 0, 0),
        StrengthExercise(name = "Шраги в тренажере для голеней", 0, 0, 0),
        StrengthExercise(name = "Шраги на нижнем блоке", 0, 0, 0),
        StrengthExercise(name = "Шраги с гантелями", 0, 0, 0),
        StrengthExercise(name = "Шраги со штангой", 0, 0, 0),
        StrengthExercise(name = "Шраги со штангой из-за спины", 0, 0, 0),
        StrengthExercise(name = "Шраги широким хватом", 0, 0, 0),
        StrengthExercise(name = "Подтягивания широким хватом", 0, 0, 0),
        StrengthExercise(name = "Широкое разведение рук с гантелями", 0, 0, 0),
        StrengthExercise(name = "Тяга верхнего блока к груди", 0, 0, 0),
        StrengthExercise(name = "Гиперэкстензия", 0, 0, 0),
        StrengthExercise(name = "Отведение рук с резиной", 0, 0, 0),
        StrengthExercise(name = "Тяга верхнего блока к груди обратным хватом", 0, 0, 0),
        StrengthExercise(name = "Тяга верхнего блока широким хватом", 0, 0, 0),
        StrengthExercise(name = "Перекрестная тяга на блоках", 0, 0, 0),
        StrengthExercise(name = "Подтягивания в стороны", 0, 0, 0),
        StrengthExercise(name = "Подтягивания от Винса Жиронды", 0, 0, 0),
        StrengthExercise(name = "Подтягивания от Рокки", 0, 0, 0),
        StrengthExercise(name = "Подтягивания широким хватом за голову", 0, 0, 0),
        StrengthExercise(name = "Тяга верхнего блока вниз", 0, 0, 0),
        CardioExercise(name = "Плавание на спине", Duration.ZERO),
        CardioExercise(name = "Вис на одной руке", Duration.ZERO),
        CardioExercise(name = "Пуловер на наклонной скамье в тросовом тренажере", Duration.ZERO),
        CardioExercise(name = "Тяга к груди в гребном тренажере", Duration.ZERO),
    ), R.drawable.back),
    WorkoutCategory(5,"Растяжка", mutableListOf(
        CardioExercise(name = "Гребля", Duration.ZERO),
        CardioExercise(name = "Дочка", Duration.ZERO),
        CardioExercise(name = "Кобра", Duration.ZERO),
        CardioExercise(name = "Глубокий выпад вперед", Duration.ZERO),
        CardioExercise(name = "Поза мостика", Duration.ZERO),
        CardioExercise(name = "Нисходящая собака", Duration.ZERO),
        CardioExercise(name = "Кошачья растяжка", Duration.ZERO),
        CardioExercise(name = "Растягивание мышц шеи в стороны", Duration.ZERO),
        CardioExercise(name = "Косплексная растяжка дельт", Duration.ZERO),
        CardioExercise(name = "Растягивание мышц груди и передней части плечевого пояса", Duration.ZERO),
        CardioExercise(name = "Растягивание мышц груди с помощью фитбола", Duration.ZERO),
        CardioExercise(name = "Растяжка грудных мышц отведением плеч", Duration.ZERO),
        CardioExercise(name = "Растягивания широчайших мышц спины в упоре стоя", Duration.ZERO),
        CardioExercise(name = "Растяжка бицепсов стоя", Duration.ZERO),
        CardioExercise(name = "Растяжка брахиалиса", Duration.ZERO),
        CardioExercise(name = "Растяжка трицепсов с использованием полотенца", Duration.ZERO),
        CardioExercise(name = "Растяжка предплечий стоя на коленях", Duration.ZERO),
        CardioExercise(name = "Растягивание мышц брюшного пресса", Duration.ZERO),
        CardioExercise(name = "Растягивание мышц пресса стоя", Duration.ZERO),
        CardioExercise(name = "Растяжка ягодичных мышц", Duration.ZERO),
        CardioExercise(name = "Растяжка квадрицепсов", Duration.ZERO),
        CardioExercise(name = "Растяжка сгибателей бедра и квадрицепсов", Duration.ZERO),
        CardioExercise(name = "Растяжка мышц бедра", Duration.ZERO),
        CardioExercise(name = "Растяжка с выпадом", Duration.ZERO),
        CardioExercise(name = "Растяжка с приседанием", Duration.ZERO),
        CardioExercise(name = "Растяжка альпиниста", Duration.ZERO),
        CardioExercise(name = "Растяжка мышц в положении сидя", Duration.ZERO),
        CardioExercise(name = "Растяжка мышц голени и задней поверхности бедра в положении стоя", Duration.ZERO),
        CardioExercise(name = "Тройная растяжка", Duration.ZERO),
        CardioExercise(name = "Растяжка мышц спины", Duration.ZERO),
        CardioExercise(name = "Растяжка супермена", Duration.ZERO),
        CardioExercise(name = "Растяжка с выпадом и поворотом", Duration.ZERO),
        CardioExercise(name = "Растяжка в положении лежа", Duration.ZERO),
    ), R.drawable.stretching),
    WorkoutCategory(6,"Пресс", mutableListOf(
        StrengthExercise(name = "Жим в подъеме туловища из положения лежа", 0, 0, 0),
        StrengthExercise(name = "\"Велосипед\"", 0, 0, 0),
        StrengthExercise(name = "\"Складной нож\"", 0, 0, 0),
        StrengthExercise(name = "Косые скручивания", 0, 0, 0),
        StrengthExercise(name = "Косые скручивания на наклонной скамье", 0, 0, 0),
        StrengthExercise(name = "Подтягивание ног к груди на горизонтальной скамье", 0, 0, 0),
        StrengthExercise(name = "Подтягивание ног к груди на фитболе", 0, 0, 0),
        StrengthExercise(name = "Подъем ног вверх в висе на перекладине", 0, 0, 0),
        StrengthExercise(name = "Подъем ног в положении лежа", 0, 0, 0),
        StrengthExercise(name = "Подъем ног на наклонной скамье", 0, 0, 0),
        StrengthExercise(name = "Подъем согнутых в коленях ног", 0, 0, 0),
        StrengthExercise(name = "Упражнение \"Дровосек\"", 0, 0, 0),
        StrengthExercise(name = "Мельница", 0, 0, 0),
        StrengthExercise(name = "W-вариант восьмерок с гирей", 0, 0, 0),
        StrengthExercise(name = "Повороты с блином", 0, 0, 0),
        StrengthExercise(name = "Подтягивание на перекладине (горилла кранч)", 0, 0, 0),
        StrengthExercise(name = "Русский твист (повороты туловища)", 0, 0, 0),
        StrengthExercise(name = "Штанга в качестве гимнастического ролика", 0, 0, 0),
        StrengthExercise(name = "Боковые скручивания", 0, 0, 0),
        StrengthExercise(name = "Наклоны в сторону с гантелей", 0, 0, 0),
        StrengthExercise(name = "Подъем ног в треняжере с упорами для локтей", 0, 0, 0),
        StrengthExercise(name = "Подъем ног лежа на горизонтальной скамье", 0, 0, 0),
        StrengthExercise(name = "Подъем туловища из положения лежа", 0, 0, 0),
        StrengthExercise(name = "Подъем туловища из положения лежа по методу Янда", 0, 0, 0),
        StrengthExercise(name = "Попеременные боковые скручивания", 0, 0, 0),
        StrengthExercise(name = "Скручивания", 0, 0, 0),
        StrengthExercise(name = "Скручивания на блоке", 0, 0, 0),
        StrengthExercise(name = "Скручивания с отягощением", 0, 0, 0),
        StrengthExercise(name = "Скручивания с поднятыми ногами", 0, 0, 0),
        StrengthExercise(name = "Удары ногами сидя на скамье", 0, 0, 0),
        StrengthExercise(name = "Скручивания на наклонной скамье", 0, 0, 0),
        StrengthExercise(name = "Упражнение \"Лягушка\"", 0, 0, 0),
        StrengthExercise(name = "Подъем ног в висе на перекладине", 0, 0, 0),
        StrengthExercise(name = "\"Восьмерки\" с гирей", 0, 0, 0),
        StrengthExercise(name = "Касания стоп", 0, 0, 0),
        CardioExercise(name = "Планка", Duration.ZERO),
        CardioExercise(name = "Ножницы", Duration.ZERO),
        CardioExercise(name = "Упражнение для косых мышц живота \"Мост\"", Duration.ZERO),
        CardioExercise(name = "Растягивание мышц пресса сидя на полу", Duration.ZERO),
        CardioExercise(name = "Растягивание мышц пресса стоя", Duration.ZERO),
    ), R.drawable.abdominal),
    WorkoutCategory(7,"Кардио", mutableListOf(
        CardioExercise(name =  "Бег на беговой дорожке", Duration.ZERO),
        CardioExercise(name = "Прыжки на скакалке", Duration.ZERO),
        CardioExercise(name = "Велотренажер", Duration.ZERO),
        CardioExercise(name = "Бёрпи", Duration.ZERO),
        CardioExercise(name = "Плавание брасс", Duration.ZERO),
        CardioExercise(name = "Плавание баттерфляй", Duration.ZERO),
        CardioExercise(name = "Плавание на спине", Duration.ZERO),
        CardioExercise(name = "Плавание кроль", Duration.ZERO),
        CardioExercise(name = "Эллипсоид", Duration.ZERO),
        CardioExercise(name = "Езда на велосипеде", Duration.ZERO),
        CardioExercise(name = "Степпер", Duration.ZERO),
        CardioExercise(name = "Лестница-степпер", Duration.ZERO),
        CardioExercise(name = "Прыжки на скакалке", Duration.ZERO),
        CardioExercise(name = "Приседания с выпрыгиванием", Duration.ZERO),
        CardioExercise(name = "Бег на улице", Duration.ZERO),
        CardioExercise(name = "\"Скалолаз\"", Duration.ZERO),
        CardioExercise(name = "Джампинг Джек", Duration.ZERO),
        CardioExercise(name = "Волны с канатами", Duration.ZERO),
        CardioExercise(name = "Бег с высоким подниманием бедра", Duration.ZERO),
        CardioExercise(name = "Йога", Duration.ZERO),
        CardioExercise(name = "Аэробика", Duration.ZERO),
        CardioExercise(name = "Бокс", Duration.ZERO),
        CardioExercise(name = "Катание на роликах", Duration.ZERO),
        CardioExercise(name = "Пилатес", Duration.ZERO),
    ), R.drawable.cardio)
)

val PreCreatedFoodList = mutableListOf(
    FoodData(generateUniqueID(),"Йогурт 1.5% жирности",5.0,1.5,3.5,51.0,100),
    FoodData(generateUniqueID(),"Кефир",2.8,3.2,4.1,59.0,100),
    FoodData(generateUniqueID(),"Молоко",2.8,3.2,4.7,58.0,100),
    FoodData(generateUniqueID(),"Молоко сухое цельное",25.6,25.0,39.4,475.0,100),
    FoodData(generateUniqueID(),"Молоко сгущеное с сахаром",7.2,8.5,56.0,315.0,100),
    FoodData(generateUniqueID(),"Ряженка",3.0,6.0,4.1,85.0,100),
    FoodData(generateUniqueID(),"Сливки 10%",3.0,10.0,4.0,118.0,100),
    FoodData(generateUniqueID(),"Сливки 20%",2.8,20.0,3.6,205.0,100),
    FoodData(generateUniqueID(),"Сметана 10%",3.0,10.0,2.9,116.0,100),
    FoodData(generateUniqueID(),"Сметана 20%",2.8,20.0,3.2,206.0,100),
    FoodData(generateUniqueID(),"Сырки и масса творожные",7.1,23.0,27.5,340.0,100),
    FoodData(generateUniqueID(),"Сыр\nроссийский",25.0,7.0,0.0,170.0,100),
    FoodData(generateUniqueID(),"Сыр\nголландский",23.4,30.0,0.0,371.0,100),
    FoodData(generateUniqueID(),"Сыр\nплавленный",24.0,13.5,0.0,226.0,100),
    FoodData(generateUniqueID(),"Творог жирный",14.0,18.0,1.3,226.0,100),
    FoodData(generateUniqueID(),"Творог\nполужирный",16.7,9.0,1.3,156.0,100),
    FoodData(generateUniqueID(),"Творог нежирный",18.0,0.6,1.5,86.0,100),
    FoodData(generateUniqueID(),"Хлеб ржаной",4.7,0.7,49.8,214.0,100),
    FoodData(generateUniqueID(),"Хлеб пшеничный",7.7,2.4,53.4,254.0,100),
    FoodData(generateUniqueID(),"Сдобная выпечка",7.6,4.5,60.0,297.0,100),
    FoodData(generateUniqueID(),"Баранки",10.4,1.3,68.7,312.0,100),
    FoodData(generateUniqueID(),"Сушки",11.0,1.3,73.0,330.0,100),
    FoodData(generateUniqueID(),"Сухари пшеничные",11.2,1.4,72.4,331.0,100),
    FoodData(generateUniqueID(),"Гречневая крупа ядрица",12.6,2.6,68.0,329.0,100),
    FoodData(generateUniqueID(),"Гречневая крупа продел",9.5,1.9,72.2,326.0,100),
    FoodData(generateUniqueID(),"Манная крупа",11.3,0.7,73.3,326.0,100),
    FoodData(generateUniqueID(),"Овсяная крупа",11.9,5.8,65.4,345.0,100),
    FoodData(generateUniqueID(),"Перловая крупа",9.3,1.1,73.7,324.0,100),
    FoodData(generateUniqueID(),"Пшено",12.0,2.9,69.3,334.0,100),
    FoodData(generateUniqueID(),"Рисовая крупа",7.0,0.6,73.7,323.0,100),
    FoodData(generateUniqueID(),"Ячневая крупа",10.4,1.3,71.7,322.0,100),
    FoodData(generateUniqueID(),"Геркулес",13.1,6.2,65.7,355.0,100),
    FoodData(generateUniqueID(),"Кукурузная крупа",8.3,1.2,75.0,325.0,100),
    FoodData(generateUniqueID(),"Баклажаны",0.6,0.1,5.5,24.0,100),
    FoodData(generateUniqueID(),"Горошек зеленый",5.0,0.2,13.3,72.0,100),
    FoodData(generateUniqueID(),"Кабачки",0.6,0.3,5.7,27.0,100),
    FoodData(generateUniqueID(),"Капуста бел",1.8,0.0,5.4,28.0,100),
    FoodData(generateUniqueID(),"Капуста кр",1.8,0.0,6.1,31.0,100),
    FoodData(generateUniqueID(),"Капуста цветная",2.5,0.0,4.9,29.0,100),
    FoodData(generateUniqueID(),"Картофель",2.0,0.1,19.7,83.0,100),
    FoodData(generateUniqueID(),"Лук зеленый (перо)",1.3,0.0,4.3,22.0,100),
    FoodData(generateUniqueID(),"Лук порей",3.0,0.0,7.3,40.0,100),
    FoodData(generateUniqueID(),"Лук репчатый",1.7,0.0,9.5,43.0,100),
    FoodData(generateUniqueID(),"Морковь красная",1.3,0.1,7.0,33.0,100),
    FoodData(generateUniqueID(),"Огурцы грунтовые",0.8,0.0,3.0,15.0,100),
    FoodData(generateUniqueID(),"Огурцы парниковые",0.7,0.0,1.8,10.0,100),
    FoodData(generateUniqueID(),"Перец  зеленый сладкий",1.3,0.0,4.7,23.0,100),
    FoodData(generateUniqueID(),"Перец  красный сладкий",1.3,0.0,5.7,27.0,100),
    FoodData(generateUniqueID(),"Петрушка (зелень)",3.7,0.0,8.1,45.0,100),
    FoodData(generateUniqueID(),"Петрушка (корень)",1.5,0.0,11.0,47.0,100),
    FoodData(generateUniqueID(),"Редис",1.2,0.0,4.1,20.0,100),
    FoodData(generateUniqueID(),"Редька",1.9,0.0,7.0,34.0,100),
    FoodData(generateUniqueID(),"Репа",1.5,0.0,5.9,28.0,100),
    FoodData(generateUniqueID(),"Салат",1.5,0.0,2.2,14.0,100),
    FoodData(generateUniqueID(),"Свекла",1.7,0.0,10.8,48.0,100),
    FoodData(generateUniqueID(),"Томаты грунтовые",0.6,0.0,4.2,19.0,100),
    FoodData(generateUniqueID(),"Томаты\nпарниковые",0.6,0.0,2.9,14.0,100),
    FoodData(generateUniqueID(),"Зеленая фасоль (стручок)",4.0,0.0,4.3,32.0,100),
    FoodData(generateUniqueID(),"Хрен",2.5,0.0,16.3,71.0,100),
    FoodData(generateUniqueID(),"Черемша",2.4,0.0,6.5,34.0,100),
    FoodData(generateUniqueID(),"Чеснок",6.5,0.0,21.2,106.0,100),
    FoodData(generateUniqueID(),"Шпинат",2.9,0.0,2.3,21.0,100),
    FoodData(generateUniqueID(),"Щавель",1.5,0.0,5.3,28.0,100),
    FoodData(generateUniqueID(),"Абрикосы",0.9,0.0,10.5,46.0,100),
    FoodData(generateUniqueID(),"Алыча",0.2,0.0,7.4,34.0,100),
    FoodData(generateUniqueID(),"Ананас",0.4,0.0,11.8,48.0,100),
    FoodData(generateUniqueID(),"Бананы",1.5,0.0,22.4,91.0,100),
    FoodData(generateUniqueID(),"Вишня",0.8,0.0,11.3,49.0,100),
    FoodData(generateUniqueID(),"Гранат",0.9,0.0,11.8,52.0,100),
    FoodData(generateUniqueID(),"Груша",0.4,0.0,10.7,42.0,100),
    FoodData(generateUniqueID(),"Инжир",0.7,0.0,13.9,56.0,100),
    FoodData(generateUniqueID(),"Персики",0.9,0.0,10.4,44.0,100),
    FoodData(generateUniqueID(),"Рябина садовая",1.4,0.0,12.5,58.0,100),
    FoodData(generateUniqueID(),"Рябина черноплодная",1.5,0.0,12.0,54.0,100),
    FoodData(generateUniqueID(),"Слива садовая",0.8,0.0,9.9,43.0,100),
    FoodData(generateUniqueID(),"Финики",2.5,0.0,72.1,281.0,100),
    FoodData(generateUniqueID(),"Хурма",0.5,0.0,15.9,62.0,100),
    FoodData(generateUniqueID(),"Черешня",1.1,0.0,12.3,52.0,100),
    FoodData(generateUniqueID(),"Яблоко",0.4,0.0,11.3,46.0,100),
    FoodData(generateUniqueID(),"Апельсин",0.9,0.0,8.4,38.0,100),
    FoodData(generateUniqueID(),"Грейпфрут",0.9,0.0,7.3,35.0,100),
    FoodData(generateUniqueID(),"Лимон",0.9,0.0,3.6,31.0,100),
    FoodData(generateUniqueID(),"Мандарин",0.8,0.0,8.6,38.0,100),
    FoodData(generateUniqueID(),"Брусника",0.7,0.0,8.6,40.0,100),
    FoodData(generateUniqueID(),"Виноград",0.4,0.0,17.5,69.0,100),
    FoodData(generateUniqueID(),"Голубика",1.0,0.0,7.7,37.0,100),
    FoodData(generateUniqueID(),"Ежевика",2.0,0.0,5.3,33.0,100),
    FoodData(generateUniqueID(),"Земляника",1.8,0.0,8.1,41.0,100),
    FoodData(generateUniqueID(),"Клюква",0.5,0.0,4.8,28.0,100),
    FoodData(generateUniqueID(),"Крыжовник",0.7,0.0,9.9,44.0,100),
    FoodData(generateUniqueID(),"Малина",0.8,0.0,9.0,41.0,100),
    FoodData(generateUniqueID(),"Морошка",0.8,0.0,6.8,31.0,100),
    FoodData(generateUniqueID(),"Облепиха",0.9,0.0,5.5,30.0,100),
    FoodData(generateUniqueID(),"Смородина белая",0.3,0.0,8.7,39.0,100),
    FoodData(generateUniqueID(),"Смородина красная",0.6,0.0,8.0,38.0,100),
    FoodData(generateUniqueID(),"Смородина черная",1.0,0.0,8.0,40.0,100),
    FoodData(generateUniqueID(),"Черника",1.1,0.0,8.6,40.0,100),
    FoodData(generateUniqueID(),"Шиповник свежий",1.6,0.0,24.0,101.0,100),
    FoodData(generateUniqueID(),"Шиповник сушеный",4.0,0.0,60.0,253.0,100),
    FoodData(generateUniqueID(),"Изюм кишмиш",2.3,0.0,71.2,279.0,100),
    FoodData(generateUniqueID(),"Вишня",1.5,0.0,73.0,292.0,100),
    FoodData(generateUniqueID(),"Груша",2.3,0.0,62.1,246.0,100),
    FoodData(generateUniqueID(),"Персики",3.0,0.0,68.5,275.0,100),
    FoodData(generateUniqueID(),"Чернослив",2.3,0.0,65.6,264.0,100),
    FoodData(generateUniqueID(),"Урюк",5.0,0.0,67.5,278.0,100),
    FoodData(generateUniqueID(),"Курага",5.2,0.0,65.9,272.0,100),
    FoodData(generateUniqueID(),"Изюм с косточкой",1.8,0.0,70.9,276.0,100),
    FoodData(generateUniqueID(),"Бобы",6.0,0.1,8.3,58.0,100),
    FoodData(generateUniqueID(),"Горох лущеный",23.0,1.6,57.7,323.0,100),
    FoodData(generateUniqueID(),"Горох цельный",23.0,1.2,53.3,303.0,100),
    FoodData(generateUniqueID(),"Соя",34.9,17.3,26.5,395.0,100),
    FoodData(generateUniqueID(),"Фасоль",22.3,1.7,54.5,309.0,100),
    FoodData(generateUniqueID(),"Чечевица",24.8,1.1,53.7,310.0,100),
    FoodData(generateUniqueID(),"Яйцо куриное",12.7,11.5,0.7,157.0,100),
    FoodData(generateUniqueID(),"Яичный порошок",45.0,37.3,7.1,542.0,100),
    FoodData(generateUniqueID(),"Сухой белок",73.3,1.8,7.0,336.0,100),
    FoodData(generateUniqueID(),"Сухой желток",34.2,52.2,4.4,623.0,100),
    FoodData(generateUniqueID(),"Яйцо\nперепелиное",11.9,13.1,0.6,168.0,100),
    FoodData(generateUniqueID(),"Камбала",16.1,2.6,0.0,88.0,100),
    FoodData(generateUniqueID(),"Карась",17.7,1.8,0.0,87.0,100),
    FoodData(generateUniqueID(),"Карп",16.0,3.6,0.0,96.0,100),
    FoodData(generateUniqueID(),"Кета",22.0,5.6,0.0,138.0,100),
    FoodData(generateUniqueID(),"Корюшка",15.5,3.2,0.0,91.0,100),
    FoodData(generateUniqueID(),"Лещ",17.1,4.1,0.0,105.0,100),
    FoodData(generateUniqueID(),"Семга",20.8,15.1,0.0,219.0,100),
    FoodData(generateUniqueID(),"Минога",14.7,11.9,0.0,166.0,100),
    FoodData(generateUniqueID(),"Минтай",15.9,0.7,0.0,70.0,100),
    FoodData(generateUniqueID(),"Мойва",13.4,11.5,0.0,157.0,100),
    FoodData(generateUniqueID(),"Налим",18.8,0.6,0.0,81.0,100),
    FoodData(generateUniqueID(),"Окунь морской",17.6,5.2,0.0,117.0,100),
    FoodData(generateUniqueID(),"Окунь речной",18.5,0.9,0.0,82.0,100),
    FoodData(generateUniqueID(),"Осетр",16.4,10.9,0.0,164.0,100),
    FoodData(generateUniqueID(),"Палтус",18.9,3.0,0.0,103.0,100),
    FoodData(generateUniqueID(),"Путассу",16.1,0.9,0.0,72.0,100),
    FoodData(generateUniqueID(),"Сазан",18.4,5.3,0.0,121.0,100),
    FoodData(generateUniqueID(),"Сайра крупная",18.6,20.8,0.0,262.0,100),
    FoodData(generateUniqueID(),"Сайра мелкая",20.4,0.8,0.0,143.0,100),
    FoodData(generateUniqueID(),"Салака",17.3,5.6,0.0,121.0,100),
    FoodData(generateUniqueID(),"Сельдь",17.7,19.5,0.0,242.0,100),
    FoodData(generateUniqueID(),"Сиг",19.0,7.5,0.0,144.0,100),
    FoodData(generateUniqueID(),"Скумбрия",18.0,9.0,0.0,153.0,100),
    FoodData(generateUniqueID(),"Сом",16.8,8.5,0.0,144.0,100),
    FoodData(generateUniqueID(),"Ставрида",18.5,5.0,0.0,119.0,100),
    FoodData(generateUniqueID(),"Стерлядь",17.0,6.1,0.0,320.0,100),
    FoodData(generateUniqueID(),"Судак",19.0,0.8,0.0,83.0,100),
    FoodData(generateUniqueID(),"Треска",17.5,0.6,0.0,75.0,100),
    FoodData(generateUniqueID(),"Тунец",22.7,0.7,0.0,96.0,100),
    FoodData(generateUniqueID(),"Угорь",14.5,30.5,0.0,333.0,100),
    FoodData(generateUniqueID(),"Хек",16.6,2.2,0.0,86.0,100),
    FoodData(generateUniqueID(),"Щука",18.8,0.7,0.0,82.0,100),
    FoodData(generateUniqueID(),"Язь",18.2,0.3,0.0,117.0,100),
    FoodData(generateUniqueID(),"Печень трески",4.2,65.7,0.0,613.0,100),
    FoodData(generateUniqueID(),"Кальмар",18.0,0.3,0.0,75.0,100),
    FoodData(generateUniqueID(),"Краб",16.0,0.5,0.0,69.0,100),
    FoodData(generateUniqueID(),"Креветка",18.0,0.8,0.0,83.0,100),
    FoodData(generateUniqueID(),"Морская капуста",0.9,0.2,3.0,5.0,100),
    FoodData(generateUniqueID(),"Маргарин молочный",0.3,82.3,1.0,746.0,100),
    FoodData(generateUniqueID(),"Маргарин бутербродный",0.5,82.0,1.2,744.0,100),
    FoodData(generateUniqueID(),"Майонез",3.1,67.0,2.6,627.0,100),
    FoodData(generateUniqueID(),"Масло растительное",0.0,99.9,0.0,899.0,100),
    FoodData(generateUniqueID(),"Масло сливочное",0.6,82.5,0.9,748.0,100),
    FoodData(generateUniqueID(),"Баранина",16.3,15.3,0.0,203.0,100),
    FoodData(generateUniqueID(),"Говядина",18.9,12.4,0.0,187.0,100),
    FoodData(generateUniqueID(),"Конина",20.2,7.0,0.0,143.0,100),
    FoodData(generateUniqueID(),"Кролик",20.7,12.9,0.0,199.0,100),
    FoodData(generateUniqueID(),"Свинина нежирная",16.4,27.8,0.0,316.0,100),
    FoodData(generateUniqueID(),"Свинина жирная",11.4,49.3,0.0,489.0,100),
    FoodData(generateUniqueID(),"Телятина",19.7,1.2,0.0,90.0,100),
    FoodData(generateUniqueID(),"Бараньи Почки",13.6,2.5,0.0,77.0,100),
    FoodData(generateUniqueID(),"Баранья Печень",18.7,2.9,0.0,101.0,100),
    FoodData(generateUniqueID(),"Баранье Сердце",13.5,2.5,0.0,82.0,100),
    FoodData(generateUniqueID(),"Говяжьи Мозги",9.5,9.5,0.0,124.0,100),
    FoodData(generateUniqueID(),"Говяжья Печень",17.4,3.1,0.0,98.0,100),
    FoodData(generateUniqueID(),"Говяжьи Почки",12.5,1.8,0.0,66.0,100),
    FoodData(generateUniqueID(),"Говяжье Вымя",12.3,13.7,0.0,173.0,100),
    FoodData(generateUniqueID(),"Говяжье Сердце",15.0,3.0,0.0,87.0,100),
    FoodData(generateUniqueID(),"Говяжий Язык",13.6,12.1,0.0,163.0,100),
    FoodData(generateUniqueID(),"Почки  свинные",13.0,3.1,0.0,80.0,100),
    FoodData(generateUniqueID(),"Печень свинная",18.8,3.6,0.0,108.0,100),
    FoodData(generateUniqueID(),"Сердце свинное",15.1,3.2,0.0,89.0,100),
    FoodData(generateUniqueID(),"Язык свинной",14.2,16.8,0.0,208.0,100),
    FoodData(generateUniqueID(),"Гусь",16.1,33.3,0.0,364.0,100),
    FoodData(generateUniqueID(),"Индейка",21.6,12.0,0.8,197.0,100),
    FoodData(generateUniqueID(),"Курица",20.8,8.8,0.6,165.0,100),
    FoodData(generateUniqueID(),"Цыплята",18.7,7.8,0.4,156.0,100),
    FoodData(generateUniqueID(),"Утка",16.5,61.2,0.0,346.0,100),
    FoodData(generateUniqueID(),"Вареная колбаса\nДиабет.",12.1,22.8,0.0,254.0,100),
    FoodData(generateUniqueID(),"Вареная колбаса\nДиетическая",12.1,13.5,0.0,170.0,100),
    FoodData(generateUniqueID(),"Вареная колбаса\nДокторская",13.7,22.8,0.0,260.0,100),
    FoodData(generateUniqueID(),"Вареная колбаса Молочная",11.7,22.8,0.0,252.0,100),
    FoodData(generateUniqueID(),"Сосиски Молочные",12.3,25.3,0.0,277.0,100),
    FoodData(generateUniqueID(),"Варено-\nкопченая\nЛюбительская",17.3,39.0,0.0,420.0,100),
    FoodData(generateUniqueID(),"Варено-\nкопченая Сервелат",28.2,27.5,0.0,360.0,100),
    FoodData(generateUniqueID(),"Полукопченая\nКраковская",16.2,44.6,0.0,466.0,100),
    FoodData(generateUniqueID(),"Полукопченая\nПолтавская",16.4,39.0,0.0,417.0,100),
    FoodData(generateUniqueID(),"Грибы белые свежие",3.2,0.7,1.6,25.0,100),
    FoodData(generateUniqueID(),"Грибы белые  сушеные",27.6,6.8,10.0,209.0,100),
    FoodData(generateUniqueID(),"Подберезовики\nсвежие",2.3,0.9,3.7,31.0,100),
    FoodData(generateUniqueID(),"Подосиновики\nсвежие",3.3,0.5,3.4,31.0,100),
    FoodData(generateUniqueID(),"Сыроежки свежие",1.7,0.3,1.4,17.0,100)
)