SELECT 'SELECT '||ASCII_CHAR(39)||
RTRIM(RDB$RELATION_NAME)||ASCII_CHAR(39)||
' TABELA, COUNT(*) FROM '||
RTRIM(RDB$RELATION_NAME)||
' WHERE IDUSUINS IS NULL ;'
FROM RDB$RELATION_FIELDS
WHERE RDB$FIELD_NAME='IDUSUINS';