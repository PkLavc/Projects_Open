// 1. addDay
data = "2024-11-01"; // Data original
resultado = addDay(data, 5); // Adiciona 5 dias à data
info resultado; // Retorna "06-Nov-2024"

// 2. addMonth
data = "2024-11-01"; // Data original
resultado = addMonth(data, 2); // Adiciona 2 meses à data
info resultado; // Retorna "01-Jan-2025"

// 3. addYear
data = "2024-11-01"; // Data original
resultado = addYear(data, 3); // Adiciona 3 anos à data
info resultado; // Retorna "01-Nov-2027"

// 4. addWeek
data = "2024-11-01"; // Data original
resultado = addWeek(data, 1); // Adiciona 1 semana à data
info resultado; // Retorna "08-Nov-2024"

// 5. getDay
data = "2024-11-01"; // Data original
resultado = getDay(data); // Obtém o dia do mês
info resultado; // Retorna 1

// 6. getDayOfWeek
data = "2024-11-01"; // Data original
resultado = getDayOfWeek(data); // Obtém o dia da semana
info resultado; // Retorna 6 (sexta-feira)

// 7. getMonth
data = "2024-11-01"; // Data original
resultado = getMonth(data); // Obtém o mês da data
info resultado; // Retorna 11 

// 8. getWeekOfYear
data = "2024-11-01"; // Data original
resultado = getWeekOfYear(data); // Obtém a semana do ano
info resultado; // Retorna 44

// 9. getYear
data = "2024-11-01"; // Data original
resultado = getYear(data); // Obtém o ano da data
info resultado; // Retorna 2024

// 10. subDay
data = "2024-11-01"; // Data original
resultado = subDay(data, 3); // Subtrai 3 dias da data
info resultado; // Retorna "29-Oct-2024"

// 11. subMonth
data = "2024-11-01"; // Data original
resultado = subMonth(data, 1); // Subtrai 1 mês da data
info resultado; // Retorna "01-Oct-2024"

// 12. subYear
data = "2024-11-01"; // Data original
resultado = subYear(data, 2); // Subtrai 2 anos da data
info resultado; // Retorna "01-Nov-2022"

// 13. subWeek
data = "2024-11-01"; // Data original
resultado = subWeek(data, 1); // Subtrai 1 semana da data
info resultado; // Retorna "25-Oct-2024"

// 14. addHour
data = "2024-11-01 10:00:00"; // Data e hora original
resultado = addHour(data, 5); // Adiciona 5 horas
info resultado; // Retorna "01-Nov-2024 15:00:00"

// 15. addMinutes
data = "2024-11-01 10:00:00"; // Data e hora original
resultado = addMinutes(data, 30); // Adiciona 30 minutos
info resultado; // Retorna "01-Nov-2024 10:30:00"

// 16. addSeconds
data = "2024-11-01 10:00:00"; // Data e hora original
resultado = addSeconds(data, 45); // Adiciona 45 segundos
info resultado; // Retorna "01-Nov-2024 10:00:45"

// 17. subHour
data = "2024-11-01 10:00:00"; // Data e hora original
resultado = subHour(data, 2); // Subtrai 2 horas
info resultado; // Retorna "01-Nov-2024 08:00:00"

// 18. subMinutes
data = "2024-11-01 10:00:00"; // Data e hora original
resultado = subMinutes(data, 15); // Subtrai 15 minutos
info resultado; // Retorna "01-Nov-2024 09:45:00"

// 19. subSeconds
data = "2024-11-01 10:00:00"; // Data e hora original
resultado = subSeconds(data, 10); // Subtrai 10 segundos
info resultado; // Retorna "01-Nov-2024 09:59:50"

// 20. addBusinessDay
data = "2024-11-01"; // Data original
resultado = addBusinessDay(data, 2); // Adiciona 2 dias úteis
info resultado; // Retorna "01-Nov-2024" (supondo que o dia 3 e 4 são fins de semana)

// 21. getDayOfYear
data = "2024-11-01"; // Data original
resultado = getDayOfYear(data); // Obtém o dia do ano
info resultado; // Retorna 306

// 22. getHour
data = "2024-11-01 10:30:00"; // Data e hora original
resultado = getHour(data); // Obtém a hora
info resultado; // Retorna 10

// 23. getMinutes
data = "2024-11-01 10:30:00"; // Data e hora original
resultado = getMinutes(data); // Obtém os minutos
info resultado; // Retorna 30

// 24. getSeconds
data = "2024-11-01 10:30:45"; // Data e hora original
resultado = getSeconds(data); // Obtém os segundos
info resultado; // Retorna 45

// 25. hoursBetween
data1 = "2024-11-01 10:00:00"; // Data e hora inicial
data2 = "2024-11-01 15:00:00"; // Data e hora final
resultado = hoursBetween(data1, data2); // Calcula as horas entre as duas datas
info resultado; // Retorna 5

// 26. monthsBetween
data1 = "2024-01-01"; // Data inicial
data2 = "2024-11-01"; // Data final
resultado = monthsBetween(data1, data2); // Calcula os meses entre as duas datas
info resultado; // Retorna 10

// 27. yearsBetween
data1 = "2020-01-01"; // Data inicial
data2 = "2024-11-01"; // Data final
resultado = yearsBetween(data1, data2); // Calcula os anos entre as duas datas
info resultado; // Retorna 4

// 28. eomonth
data = "2024-11-01"; // Data original
resultado = eomonth(data, 0); // Obtém o último dia do mês da data
info resultado; // Retorna "30-Nov-2024"

// 29. workday
data = "2024-11-01"; // Data original
resultado = workday(data, 5); // Adiciona 5 dias úteis
info resultado; // Retorna "08-Nov-2024" (supondo que não haja feriados)

// 30. weekday
data = "2024-11-01"; // Data original
resultado = weekday(data); // Obtém o dia da semana
info resultado; // Retorna 6 (sexta-feira)

// 31. toStartOfMonth
data = "2024-11-15"; // Data original
resultado = toStartOfMonth(data); // Obtém o primeiro dia do mês
info resultado; // Retorna "01-Nov-2024"

// 32. toStartOfWeek
data = "2024-11-01"; // Data original
resultado = toStartOfWeek(data); // Obtém o primeiro dia da semana
info resultado; // Retorna "27-Oct-2024" (supondo que a semana comece no domingo)

// 33. yearfraction
data1 = "2024-01-01"; // Data inicial
data2 = "2024-11-01"; // Data final
resultado = yearfraction(data1, data2); // Calcula a fração do ano entre as duas datas
info resultado; // Retorna aproximadamente 0.8355022831050227

// 34. workdaysBetween
data1 = "2024-11-01"; // Data inicial
data2 = "2024-11-10"; // Data final
resultado = workdaysBetween(data1, data2); // Calcula os dias úteis entre as duas datas
info resultado; // Retorna 5 (supondo que não haja feriados)

// 35. daysBetween
data1 = "2024-11-01"; // Data inicial
data2 = "2024-11-10"; // Data final
resultado = daysBetween(data1, data2); // Calcula os dias entre as duas datas
info resultado; // Retorna 9

// 36. workdaysList
data1 = "2024-11-01"; // Data inicial
data2 = "2024-11-10"; // Data final
resultado = workdaysList(data1, data2); // Obtém uma lista de dias úteis entre as duas datas
info resultado; // Retorna uma lista de datas úteis

// 37. getTime
time = '17-Jan-2018 18:10:37'.getTime(12);
info time; // Retorna 6:10 PM

// 38. getDate
currentDate = '17-Jan-2018 18:10:37';
info currentDate.getDate(); // Retorna "17th January 2018"

// 39. getDateTime
currentDate = '17-Jan-2018 18:10:37';
info currentDate.getDateTime(); //returna  "17th January 2018,06:10 PM"

currentDate='17-Jan-2018 10:10:37';
info currentDate.getDateTime(12, true); // returna "17th January 2018,06:10 PM"

// 40. addBusinessHour
data = "2024-11-01 09:00:00"; // Data e hora original
resultado = addBusinessHour(data, 3); // Adiciona 3 horas úteis
info resultado; // Retorna a nova data e hora, considerando horários comerciais "01-Nov-2024 12:00:00"