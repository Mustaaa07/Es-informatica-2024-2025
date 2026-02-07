<?php

return [
        'dns' =>'mysql:host=192.168.60.144;dbname=dessant_mustafaj_itis;charset=utf8mb4',
        'username' => 'dessant_mustafaj',
        'password' => 'danzavamo.allandare.',
        'options'  => [
        PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_OBJ,
        PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
    ]
];