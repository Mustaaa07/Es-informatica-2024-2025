<?php

require 'DataBaseConn.php';
$DBconfig = require 'configuration/DBconfiguration.php';
$db = new PDO( $DBconfig['dns'],$DBconfig['username'],$DBconfig['password'],$DBconfig['options']);

$db = DataBaseConn::getDB($DBconfig);
/*
$db = new PDO(
    'mysql:host=192.168.60.144;dbname=dessant_mustafaj_itis;charset=utf8mb4',
    'dessant_mustafaj',
    'danzavamo.allandare.',

    [
        PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_OBJ,
        PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
    ]

);*/



//READ 2
/*
$query = 'SELECT media, cognome FROM studenti where nome = :name';

try {
    $stmt = $db->prepare($query);
    $stmt->bindValue(':name','Antonio',PDO::PARAM_STR);
    $stmt->execute();

    while ($user = $stmt->fetch()) {

        echo "cognome:". $user->cognome . '<br>';
        echo "media:". $user->media . '<br>';
        echo "<hr>";
    }
    $stmt->closeCursor();
}catch(PDOException $e) {
    echo "A DB error occured. Please try again later. ";
}

//CREATE

$query = 'INSERT INTO studenti(nome,cognome,media,data_iscrizione)
          VALUES (  :nome, :cognome, :media, NOW())';

try {
    $stmt = $db->prepare($query);
    $stmt->bindValue(':nome','Lucy',PDO::PARAM_STR);
    $stmt->bindValue(':cognome','Taylor',PDO::PARAM_STR);
    $stmt->bindValue(':media','8',PDO::PARAM_INT);
    $stmt->execute();
    echo "Insert succesful.";
    $stmt->closeCursor();
}catch(PDOException $e) {
    // error_log($e->getMessage());
    echo "A DB error occured. Please try again later. ";
}
*/
/*
$query = 'UPDATE studenti
SET media = :media
WHERE nome = :name';

try {
    $stmt = $db->prepare($query);
    $stmt->bindValue(':name', 'Antonio', PDO::PARAM_STR);
    $stmt->bindValue(':media', 10, PDO::PARAM_INT);
    $stmt->execute();

    if ($stmt->rowCount() === 0) {
        echo "No rows were updated.";
    } else {
        echo "Update successful.";
    }
    echo '<br>';
    $stmt->closeCursor();
} catch (PDOException $e) {
    echo "A database error occurred. Please try again later.";
    echo '<br>';
    echo $e;
    echo '<br>';
}

//DELETE

$query = 'DELETE FROM studenti WHERE nome = :name';

try{
    $stmt = $db->prepare($query);
    $stmt->bindValue(':name', 'Lucy', PDO::PARAM_STR);
    $stmt->execute();

    if($stmt->rowCount() === 0){
        echo "No rows were updated. Please try again later. ";

    }else{
        echo "Rows were updated.";
    }
    $stmt->closeCursor();
} catch(PDOException $e) {
    echo "A DB error occured. Please try again later. ";
}
*/
//READ

$query = 'SELECT * FROM studenti';

try {
    $stmt = $db->prepare($query);
    $stmt->execute();

    while ($user = $stmt->fetch()) {
        echo "ID:". $user->id. '<br>';
        echo "nome:". $user->nome . '<br>';
        echo "cognome:". $user->cognome . '<br>';
        echo "media:". $user->media . '<br>';
        echo "data_iscrizione:". $user->data_iscrizione . '<br>';
        echo "<hr>";
    }
    $stmt->closeCursor();
}catch(PDOException $e) {
    echo "A DB error occured. Please try again later. ";
}
