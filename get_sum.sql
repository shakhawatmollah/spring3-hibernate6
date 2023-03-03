DELIMITER $$

USE `spring3_hibernate6`$$

DROP FUNCTION IF EXISTS `get_sum`$$

CREATE DEFINER=`root`@`localhost` FUNCTION `get_sum`(a INT,
                        b INT) RETURNS INT(11)
    DETERMINISTIC
BEGIN
  DECLARE total_value INT;

  SET total_value = a + b;

  RETURN total_value;
END$$

DELIMITER ;