CREATE TABLE IF NOT EXISTS `nndb`.`connections` (
  `src_cell_id` INT NOT NULL,
  `dest_cell_id` INT NOT NULL,
  `weight` DOUBLE NULL,
  `delta_weight` DOUBLE NULL,
  PRIMARY KEY (`src_cell_id`, `dest_cell_id`)
) ENGINE = InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;