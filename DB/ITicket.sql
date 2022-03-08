
use ITicket;

drop table if exists `ITicket`.`eventos`;
CREATE TABLE `ITicket`.`eventos` (
  `idEvento` INT NOT NULL AUTO_INCREMENT,
  `artista` VARCHAR(45) NOT NULL,
  `fechaconcierto` DATE NOT NULL,
  `costoevento` MEDIUMINT NOT NULL,
  `capacidadMax` SMALLINT NOT NULL,
  `lugarconcierto` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idEvento`),
  UNIQUE INDEX `idEvento_UNIQUE` (`idEvento` ASC) VISIBLE);
  
INSERT INTO `eventos` VALUES (1,'Lamb of god', '2022-08-15', '20000', '150', 'Club Peppers');
INSERT INTO `eventos` VALUES (2,'Kreator', '2022-12-22', '15000', '200', 'Centro Eventos Pedregal');
  