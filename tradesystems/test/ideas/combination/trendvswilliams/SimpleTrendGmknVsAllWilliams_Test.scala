package ideas.combination.trendvswilliams

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import tradinganalyzers.statistics.DayStandardImporter
import tradingideas.{NegativeTrendCandles, PositiveTrendCandles, WilliamsAdMin, WilliamsAdMax}
import tradingsystems.TradingData
import ideas.combination.trendvstrend.SimpleTrendSuccessfulStrategies

/**
 * @author alespuh
 * @since 31.07.13
 */
@RunWith(classOf[JUnitRunner])
class SimpleTrendGmknVsAllWilliams_Test extends FunSuite with SimpleTrendVsWilliams
{
    test("gmkn VS gmkn"){ checkCombination(williams.gmknBestStrategies, DayStandardImporter.gmkn, 35) }
//    нет ничего
    test("gmkn VS gazp"){ checkCombination(williams.gazpBestStrategies, DayStandardImporter.gazp, 30) }
//    |GMKN|2 дня роста, 3 дня в op:sell p:12,00 s: 2,00|GMKN|3 дня падения, 5 дня в op:buy  p:12,00 s: 2,00|LKOH|Max Williams A/D | 3|6|2|op:sell p:12,00 s: 2,00|LKOH|Min Williams A/D | 6|5|1|op:buy  p:12,00 s: 2,00| | 2010|034|037|  49,84|-7,77| -7,77|2011|028|040|  40,09|-6,36| -5,55|2012|037|021|  62,65|-2,00| -4,06|2013|013|008|  20,18|0,00| -3,28 |  | 1 | 006 | -7,77 | -7,77 | 2 | 004 | 14,26 | 0,00 | 3 | 008 | 10,87 | -6,00 | 4 | 006 | 12,21 | -0,14 | 5 | 008 | 1,20 | -6,00 | 6 | 007 | -2,71 | -2,71 | 7 | 006 | 12,41 | -2,00 | 8 | 005 | 1,06 | 0,00 | 9 | 004 | 0,62 | -3,26 | 10 | 006 | -6,31 | -6,31 | 11 | 004 | 2,87 | 0,00 | 12 | 007 | 11,11 | -4,00| | 1 | 004 | -1,45 | -1,45 | 2 | 005 | -2,90 | -2,90 | 3 | 004 | 6,28 | -2,00 | 4 | 006 | 3,58 | -2,00 | 5 | 006 | 2,18 | -4,00 | 6 | 004 | 1,11 | 0,00 | 7 | 004 | -3,23 | -3,29 | 8 | 006 | 2,00 | 0,00 | 9 | 008 | 29,93 | -2,07 | 10 | 006 | 0,07 | -2,69 | 11 | 006 | 4,19 | -4,00 | 12 | 009 | -1,67 | -5,55| | 1 | 005 | 18,28 | -2,00 | 2 | 004 | 8,57 | -0,80 | 3 | 006 | 3,89 | -2,00 | 4 | 003 | 1,16 | 0,00 | 5 | 005 | 10,42 | 0,00 | 6 | 004 | 6,64 | -0,01 | 7 | 004 | 3,35 | -2,00 | 8 | 007 | -2,79 | -4,06 | 9 | 005 | 7,79 | 0,00 | 10 | 004 | 6,83 | 0,00 | 11 | 005 | 2,28 | 0,00 | 12 | 006 | -3,78 | -4,06| | 1 | 002 | 1,61 | 0,00 | 2 | 003 | -0,71 | -0,71 | 3 | 004 | 6,07 | 0,00 | 4 | 005 | 9,41 | 0,00 | 5 | 005 | -1,75 | -3,28 | 6 | 002 | 5,57 | -0,78
//    |GMKN|3 дня падения, 5 дня в op:buy  p:12,00 s: 2,00|GMKN|2 дня роста, 3 дня в op:sell p:12,00 s: 2,00|LKOH|Max Williams A/D | 3|6|2|op:sell p:12,00 s: 2,00|LKOH|Min Williams A/D | 6|5|1|op:buy  p:12,00 s: 2,00| | 2010|034|037|  49,84|-7,77| -7,77|2011|028|040|  40,09|-6,36| -5,55|2012|037|021|  62,65|-2,00| -4,06|2013|013|008|  20,18|0,00| -3,28 |  | 1 | 006 | -7,77 | -7,77 | 2 | 004 | 14,26 | 0,00 | 3 | 008 | 10,87 | -6,00 | 4 | 006 | 12,21 | -0,14 | 5 | 008 | 1,20 | -6,00 | 6 | 007 | -2,71 | -2,71 | 7 | 006 | 12,41 | -2,00 | 8 | 005 | 1,06 | 0,00 | 9 | 004 | 0,62 | -3,26 | 10 | 006 | -6,31 | -6,31 | 11 | 004 | 2,87 | 0,00 | 12 | 007 | 11,11 | -4,00| | 1 | 004 | -1,45 | -1,45 | 2 | 005 | -2,90 | -2,90 | 3 | 004 | 6,28 | -2,00 | 4 | 006 | 3,58 | -2,00 | 5 | 006 | 2,18 | -4,00 | 6 | 004 | 1,11 | 0,00 | 7 | 004 | -3,23 | -3,29 | 8 | 006 | 2,00 | 0,00 | 9 | 008 | 29,93 | -2,07 | 10 | 006 | 0,07 | -2,69 | 11 | 006 | 4,19 | -4,00 | 12 | 009 | -1,67 | -5,55| | 1 | 005 | 18,28 | -2,00 | 2 | 004 | 8,57 | -0,80 | 3 | 006 | 3,89 | -2,00 | 4 | 003 | 1,16 | 0,00 | 5 | 005 | 10,42 | 0,00 | 6 | 004 | 6,64 | -0,01 | 7 | 004 | 3,35 | -2,00 | 8 | 007 | -2,79 | -4,06 | 9 | 005 | 7,79 | 0,00 | 10 | 004 | 6,83 | 0,00 | 11 | 005 | 2,28 | 0,00 | 12 | 006 | -3,78 | -4,06| | 1 | 002 | 1,61 | 0,00 | 2 | 003 | -0,71 | -0,71 | 3 | 004 | 6,07 | 0,00 | 4 | 005 | 9,41 | 0,00 | 5 | 005 | -1,75 | -3,28 | 6 | 002 | 5,57 | -0,78
//    |GMKN|2 дня роста, 3 дня в op:sell p:13,00 s: 2,00|GMKN|3 дня падения, 5 дня в op:buy  p:13,00 s: 2,00|LKOH|Max Williams A/D | 3|6|2|op:sell p:13,00 s: 2,00|LKOH|Min Williams A/D | 6|5|1|op:buy  p:13,00 s: 2,00| | 2010|034|037|  49,84|-7,77| -7,77|2011|028|040|  41,73|-6,36| -5,55|2012|037|021|  60,70|-2,00| -4,06|2013|013|008|  20,18|0,00| -3,28 |  | 1 | 006 | -7,77 | -7,77 | 2 | 004 | 14,26 | 0,00 | 3 | 008 | 10,87 | -6,00 | 4 | 006 | 12,21 | -0,14 | 5 | 008 | 1,20 | -6,00 | 6 | 007 | -2,71 | -2,71 | 7 | 006 | 12,41 | -2,00 | 8 | 005 | 1,06 | 0,00 | 9 | 004 | 0,62 | -3,26 | 10 | 006 | -6,31 | -6,31 | 11 | 004 | 2,87 | 0,00 | 12 | 007 | 11,11 | -4,00| | 1 | 004 | -1,45 | -1,45 | 2 | 005 | -2,90 | -2,90 | 3 | 004 | 6,28 | -2,00 | 4 | 006 | 3,58 | -2,00 | 5 | 006 | 2,18 | -4,00 | 6 | 004 | 1,11 | 0,00 | 7 | 004 | -3,23 | -3,29 | 8 | 006 | 3,00 | 0,00 | 9 | 008 | 30,58 | -2,07 | 10 | 006 | 0,07 | -2,69 | 11 | 006 | 4,19 | -4,00 | 12 | 009 | -1,67 | -5,55| | 1 | 005 | 16,34 | -2,00 | 2 | 004 | 8,57 | -0,80 | 3 | 006 | 3,89 | -2,00 | 4 | 003 | 1,16 | 0,00 | 5 | 005 | 10,42 | 0,00 | 6 | 004 | 6,64 | -0,01 | 7 | 004 | 3,35 | -2,00 | 8 | 007 | -2,79 | -4,06 | 9 | 005 | 7,79 | 0,00 | 10 | 004 | 6,83 | 0,00 | 11 | 005 | 2,28 | 0,00 | 12 | 006 | -3,78 | -4,06| | 1 | 002 | 1,61 | 0,00 | 2 | 003 | -0,71 | -0,71 | 3 | 004 | 6,07 | 0,00 | 4 | 005 | 9,41 | 0,00 | 5 | 005 | -1,75 | -3,28 | 6 | 002 | 5,57 | -0,78
//    |GMKN|3 дня падения, 5 дня в op:buy  p:13,00 s: 2,00|GMKN|2 дня роста, 3 дня в op:sell p:13,00 s: 2,00|LKOH|Max Williams A/D | 3|6|2|op:sell p:13,00 s: 2,00|LKOH|Min Williams A/D | 6|5|1|op:buy  p:13,00 s: 2,00| | 2010|034|037|  49,84|-7,77| -7,77|2011|028|040|  41,73|-6,36| -5,55|2012|037|021|  60,70|-2,00| -4,06|2013|013|008|  20,18|0,00| -3,28 |  | 1 | 006 | -7,77 | -7,77 | 2 | 004 | 14,26 | 0,00 | 3 | 008 | 10,87 | -6,00 | 4 | 006 | 12,21 | -0,14 | 5 | 008 | 1,20 | -6,00 | 6 | 007 | -2,71 | -2,71 | 7 | 006 | 12,41 | -2,00 | 8 | 005 | 1,06 | 0,00 | 9 | 004 | 0,62 | -3,26 | 10 | 006 | -6,31 | -6,31 | 11 | 004 | 2,87 | 0,00 | 12 | 007 | 11,11 | -4,00| | 1 | 004 | -1,45 | -1,45 | 2 | 005 | -2,90 | -2,90 | 3 | 004 | 6,28 | -2,00 | 4 | 006 | 3,58 | -2,00 | 5 | 006 | 2,18 | -4,00 | 6 | 004 | 1,11 | 0,00 | 7 | 004 | -3,23 | -3,29 | 8 | 006 | 3,00 | 0,00 | 9 | 008 | 30,58 | -2,07 | 10 | 006 | 0,07 | -2,69 | 11 | 006 | 4,19 | -4,00 | 12 | 009 | -1,67 | -5,55| | 1 | 005 | 16,34 | -2,00 | 2 | 004 | 8,57 | -0,80 | 3 | 006 | 3,89 | -2,00 | 4 | 003 | 1,16 | 0,00 | 5 | 005 | 10,42 | 0,00 | 6 | 004 | 6,64 | -0,01 | 7 | 004 | 3,35 | -2,00 | 8 | 007 | -2,79 | -4,06 | 9 | 005 | 7,79 | 0,00 | 10 | 004 | 6,83 | 0,00 | 11 | 005 | 2,28 | 0,00 | 12 | 006 | -3,78 | -4,06| | 1 | 002 | 1,61 | 0,00 | 2 | 003 | -0,71 | -0,71 | 3 | 004 | 6,07 | 0,00 | 4 | 005 | 9,41 | 0,00 | 5 | 005 | -1,75 | -3,28 | 6 | 002 | 5,57 | -0,78
    test("gmkn VS lkoh"){ checkCombination(williams.lkohBestStrategies, DayStandardImporter.lkoh, 40) }
//    |NVTK|Min Williams A/D | 6|6|3|op:buy  p:11,00 s: 5,00|GMKN|2 дня роста, 2 дня в op:sell p:11,00 s: 5,00|GMKN|5 дня падения, 7 дня в op:buy  p:11,00 s: 5,00|NVTK|Max Williams A/D | 6|6|1|op:sell p:11,00 s: 5,00| | 2010|029|018|  59,36|-3,12|-10,00|2011|028|020|  62,47|-20,95|-10,22|2012|030|017|  61,84|-1,33| -6,41|2013|010|006|  30,80|0,00| -9,86 |  | 1 | 003 | -1,53 | -3,12 | 2 | 003 | 14,55 | 0,00 | 3 | 004 | 14,18 | 0,00 | 4 | 005 | 6,29 | -2,97 | 5 | 003 | 23,94 | 0,00 | 6 | 004 | -2,52 | -10,00 | 7 | 003 | -1,52 | -1,84 | 8 | 004 | 4,74 | -3,56 | 9 | 004 | -3,73 | -6,57 | 10 | 004 | -5,06 | -5,06 | 11 | 005 | 1,33 | -10,00 | 12 | 005 | 8,69 | 0,00| | 1 | 003 | -9,79 | -9,79 | 2 | 003 | 0,50 | -5,75 | 3 | 004 | -1,44 | -6,33 | 4 | 004 | -10,22 | -10,22 | 5 | 004 | 9,40 | 0,00 | 6 | 004 | 2,83 | -0,64 | 7 | 005 | 2,07 | -10,00 | 8 | 004 | 27,53 | 0,00 | 9 | 006 | 20,44 | -6,82 | 10 | 004 | 0,77 | 0,00 | 11 | 003 | 13,66 | 0,00 | 12 | 004 | 6,70 | 0,00| | 1 | 004 | 1,95 | -1,33 | 2 | 004 | 6,66 | 0,00 | 3 | 004 | 7,78 | 0,00 | 4 | 003 | 4,84 | 0,00 | 5 | 005 | 12,86 | 0,00 | 6 | 005 | 10,29 | 0,00 | 7 | 005 | 17,50 | -5,00 | 8 | 004 | 1,63 | 0,00 | 9 | 003 | -0,70 | -1,15 | 10 | 002 | -6,41 | -6,41 | 11 | 003 | 4,44 | 0,00 | 12 | 005 | 1,01 | 0,00| | 1 | 002 | 2,83 | 0,00 | 2 | 003 | 3,07 | -2,45 | 3 | 002 | 4,21 | 0,00 | 4 | 004 | -9,86 | -9,86 | 5 | 004 | 25,91 | 0,00 | 6 | 001 | 4,63 | 0,00
//    |NVTK|Min Williams A/D | 6|6|3|op:buy  p:11,00 s: 5,00|GMKN|5 дня падения, 7 дня в op:buy  p:11,00 s: 5,00|GMKN|2 дня роста, 2 дня в op:sell p:11,00 s: 5,00|NVTK|Max Williams A/D | 6|6|1|op:sell p:11,00 s: 5,00| | 2010|029|018|  59,36|-3,12|-10,00|2011|028|020|  62,47|-20,95|-10,22|2012|030|017|  61,84|-1,33| -6,41|2013|010|006|  30,80|0,00| -9,86 |  | 1 | 003 | -1,53 | -3,12 | 2 | 003 | 14,55 | 0,00 | 3 | 004 | 14,18 | 0,00 | 4 | 005 | 6,29 | -2,97 | 5 | 003 | 23,94 | 0,00 | 6 | 004 | -2,52 | -10,00 | 7 | 003 | -1,52 | -1,84 | 8 | 004 | 4,74 | -3,56 | 9 | 004 | -3,73 | -6,57 | 10 | 004 | -5,06 | -5,06 | 11 | 005 | 1,33 | -10,00 | 12 | 005 | 8,69 | 0,00| | 1 | 003 | -9,79 | -9,79 | 2 | 003 | 0,50 | -5,75 | 3 | 004 | -1,44 | -6,33 | 4 | 004 | -10,22 | -10,22 | 5 | 004 | 9,40 | 0,00 | 6 | 004 | 2,83 | -0,64 | 7 | 005 | 2,07 | -10,00 | 8 | 004 | 27,53 | 0,00 | 9 | 006 | 20,44 | -6,82 | 10 | 004 | 0,77 | 0,00 | 11 | 003 | 13,66 | 0,00 | 12 | 004 | 6,70 | 0,00| | 1 | 004 | 1,95 | -1,33 | 2 | 004 | 6,66 | 0,00 | 3 | 004 | 7,78 | 0,00 | 4 | 003 | 4,84 | 0,00 | 5 | 005 | 12,86 | 0,00 | 6 | 005 | 10,29 | 0,00 | 7 | 005 | 17,50 | -5,00 | 8 | 004 | 1,63 | 0,00 | 9 | 003 | -0,70 | -1,15 | 10 | 002 | -6,41 | -6,41 | 11 | 003 | 4,44 | 0,00 | 12 | 005 | 1,01 | 0,00| | 1 | 002 | 2,83 | 0,00 | 2 | 003 | 3,07 | -2,45 | 3 | 002 | 4,21 | 0,00 | 4 | 004 | -9,86 | -9,86 | 5 | 004 | 25,91 | 0,00 | 6 | 001 | 4,63 | 0,00
//    |GMKN|5 дня падения, 7 дня в op:buy  p:11,00 s: 5,00|NVTK|Min Williams A/D | 6|6|3|op:buy  p:11,00 s: 5,00|GMKN|2 дня роста, 2 дня в op:sell p:11,00 s: 5,00|NVTK|Max Williams A/D | 6|6|1|op:sell p:11,00 s: 5,00| | 2010|029|018|  59,36|-3,12|-10,00|2011|028|020|  62,47|-20,95|-10,22|2012|031|016|  65,86|-1,33| -6,41|2013|010|006|  30,80|0,00| -9,86 |  | 1 | 003 | -1,53 | -3,12 | 2 | 003 | 14,55 | 0,00 | 3 | 004 | 14,18 | 0,00 | 4 | 005 | 6,29 | -2,97 | 5 | 003 | 23,94 | 0,00 | 6 | 004 | -2,52 | -10,00 | 7 | 003 | -1,52 | -1,84 | 8 | 004 | 4,74 | -3,56 | 9 | 004 | -3,73 | -6,57 | 10 | 004 | -5,06 | -5,06 | 11 | 005 | 1,33 | -10,00 | 12 | 005 | 8,69 | 0,00| | 1 | 003 | -9,79 | -9,79 | 2 | 003 | 0,50 | -5,75 | 3 | 004 | -1,44 | -6,33 | 4 | 004 | -10,22 | -10,22 | 5 | 004 | 9,40 | 0,00 | 6 | 004 | 2,83 | -0,64 | 7 | 005 | 2,07 | -10,00 | 8 | 004 | 27,53 | 0,00 | 9 | 006 | 20,44 | -6,82 | 10 | 004 | 0,77 | 0,00 | 11 | 003 | 13,66 | 0,00 | 12 | 004 | 6,70 | 0,00| | 1 | 004 | 1,95 | -1,33 | 2 | 004 | 6,66 | 0,00 | 3 | 004 | 7,78 | 0,00 | 4 | 003 | 4,84 | 0,00 | 5 | 005 | 12,86 | 0,00 | 6 | 005 | 10,29 | 0,00 | 7 | 005 | 17,50 | -5,00 | 8 | 004 | 1,63 | 0,00 | 9 | 003 | 3,32 | 0,00 | 10 | 002 | -6,41 | -6,41 | 11 | 003 | 4,44 | 0,00 | 12 | 005 | 1,01 | 0,00| | 1 | 002 | 2,83 | 0,00 | 2 | 003 | 3,07 | -2,45 | 3 | 002 | 4,21 | 0,00 | 4 | 004 | -9,86 | -9,86 | 5 | 004 | 25,91 | 0,00 | 6 | 001 | 4,63 | 0,00
    test("gmkn VS nvtk"){ checkCombination(williams.nvtkBestStrategies, DayStandardImporter.nvtk, 59) }
//    |ROSN|Max Williams A/D | 3|4|2|op:sell p:10,00 s: 4,00|GMKN|5 дня падения, 6 дня в op:buy  p:10,00 s: 4,00|ROSN|Min Williams A/D |12|3|3|op:buy  p:10,00 s: 4,00|GMKN|2 дня роста, 2 дня в op:sell p:10,00 s: 4,00| | 2010|032|024|  71,25|-3,12| -4,00|2011|041|024|  56,64|-7,85|-11,17|2012|035|026|  42,97|-3,64| -9,34|2013|018|006|  24,13|-1,02| -3,40 |  | 1 | 003 | 8,27 | -3,12 | 2 | 004 | 11,49 | 0,00 | 3 | 006 | 4,82 | -2,56 | 4 | 004 | 2,45 | -4,00 | 5 | 004 | 22,55 | 0,00 | 6 | 005 | 5,76 | 0,00 | 7 | 006 | 6,03 | 0,00 | 8 | 005 | -0,97 | -0,97 | 9 | 004 | 1,36 | -0,70 | 10 | 005 | 8,14 | 0,00 | 11 | 005 | 0,36 | -1,87 | 12 | 005 | 0,98 | 0,00| | 1 | 004 | -7,85 | -7,85 | 2 | 004 | 6,16 | 0,00 | 3 | 004 | 3,43 | 0,00 | 4 | 006 | 11,58 | 0,00 | 5 | 005 | 6,89 | 0,00 | 6 | 004 | 4,08 | 0,00 | 7 | 006 | 5,28 | 0,00 | 8 | 008 | -6,50 | -11,17 | 9 | 009 | 24,45 | -1,86 | 10 | 005 | -5,51 | -8,17 | 11 | 005 | 10,66 | -4,00 | 12 | 005 | 3,97 | 0,00| | 1 | 004 | -1,03 | -3,64 | 2 | 006 | 10,21 | 0,00 | 3 | 005 | 9,12 | 0,00 | 4 | 004 | 3,17 | -1,45 | 5 | 006 | 14,53 | 0,00 | 6 | 005 | 0,33 | -0,51 | 7 | 006 | 15,71 | -4,00 | 8 | 005 | 1,94 | -2,62 | 9 | 005 | -0,70 | -1,13 | 10 | 004 | -5,34 | -6,39 | 11 | 006 | 4,36 | -4,00 | 12 | 005 | -9,34 | -9,34| | 1 | 004 | 1,08 | -1,02 | 2 | 004 | 9,23 | 0,00 | 3 | 005 | 6,36 | 0,00 | 4 | 004 | 10,41 | 0,00 | 5 | 005 | 0,45 | 0,00 | 6 | 002 | -3,40 | -3,40
//    |ROSN|Max Williams A/D | 3|4|2|op:sell p:10,00 s: 4,00|GMKN|5 дня падения, 6 дня в op:buy  p:10,00 s: 4,00|GMKN|2 дня роста, 2 дня в op:sell p:10,00 s: 4,00|ROSN|Min Williams A/D |12|3|3|op:buy  p:10,00 s: 4,00| | 2010|034|024|  67,68|-3,12| -7,73|2011|039|026|  48,00|-7,85|-11,17|2012|035|026|  42,97|-3,64| -9,34|2013|019|005|  32,77|-1,02| -1,02 |  | 1 | 003 | 8,27 | -3,12 | 2 | 004 | 15,53 | 0,00 | 3 | 006 | 4,82 | -2,56 | 4 | 004 | 6,18 | -4,00 | 5 | 004 | 22,55 | 0,00 | 6 | 005 | 5,76 | 0,00 | 7 | 007 | 10,32 | 0,00 | 8 | 005 | -0,97 | -0,97 | 9 | 004 | 1,36 | -0,70 | 10 | 005 | 1,23 | -2,43 | 11 | 005 | 0,36 | -1,87 | 12 | 006 | -7,73 | -7,73| | 1 | 004 | -7,85 | -7,85 | 2 | 004 | 6,16 | 0,00 | 3 | 004 | 3,43 | 0,00 | 4 | 006 | 11,58 | 0,00 | 5 | 005 | 6,89 | 0,00 | 6 | 005 | -1,37 | -1,37 | 7 | 005 | 6,00 | 0,00 | 8 | 008 | -6,50 | -11,17 | 9 | 009 | 24,45 | -1,86 | 10 | 005 | -5,51 | -8,17 | 11 | 005 | 6,76 | -4,00 | 12 | 005 | 3,97 | 0,00| | 1 | 004 | -1,03 | -3,64 | 2 | 006 | 10,21 | 0,00 | 3 | 005 | 9,12 | 0,00 | 4 | 004 | 3,17 | -1,45 | 5 | 006 | 14,53 | 0,00 | 6 | 005 | 0,33 | -0,51 | 7 | 006 | 15,71 | -4,00 | 8 | 005 | 1,94 | -2,62 | 9 | 005 | -0,70 | -1,13 | 10 | 004 | -5,34 | -6,39 | 11 | 006 | 4,36 | -4,00 | 12 | 005 | -9,34 | -9,34| | 1 | 004 | 1,08 | -1,02 | 2 | 004 | 9,23 | 0,00 | 3 | 005 | 6,36 | 0,00 | 4 | 004 | 10,41 | 0,00 | 5 | 005 | 0,45 | 0,00 | 6 | 002 | 5,23 | 0,00
//    |GMKN|5 дня падения, 6 дня в op:buy  p:10,00 s: 4,00|ROSN|Max Williams A/D | 3|4|2|op:sell p:10,00 s: 4,00|ROSN|Min Williams A/D |12|3|3|op:buy  p:10,00 s: 4,00|GMKN|2 дня роста, 2 дня в op:sell p:10,00 s: 4,00| | 2010|032|024|  71,25|-3,12| -4,00|2011|041|024|  56,64|-7,85|-11,17|2012|035|026|  42,97|-3,64| -9,34|2013|018|006|  24,13|-1,02| -3,40 |  | 1 | 003 | 8,27 | -3,12 | 2 | 004 | 11,49 | 0,00 | 3 | 006 | 4,82 | -2,56 | 4 | 004 | 2,45 | -4,00 | 5 | 004 | 22,55 | 0,00 | 6 | 005 | 5,76 | 0,00 | 7 | 006 | 6,03 | 0,00 | 8 | 005 | -0,97 | -0,97 | 9 | 004 | 1,36 | -0,70 | 10 | 005 | 8,14 | 0,00 | 11 | 005 | 0,36 | -1,87 | 12 | 005 | 0,98 | 0,00| | 1 | 004 | -7,85 | -7,85 | 2 | 004 | 6,16 | 0,00 | 3 | 004 | 3,43 | 0,00 | 4 | 006 | 11,58 | 0,00 | 5 | 005 | 6,89 | 0,00 | 6 | 004 | 4,08 | 0,00 | 7 | 006 | 5,28 | 0,00 | 8 | 008 | -6,50 | -11,17 | 9 | 009 | 24,45 | -1,86 | 10 | 005 | -5,51 | -8,17 | 11 | 005 | 10,66 | -4,00 | 12 | 005 | 3,97 | 0,00| | 1 | 004 | -1,03 | -3,64 | 2 | 006 | 10,21 | 0,00 | 3 | 005 | 9,12 | 0,00 | 4 | 004 | 3,17 | -1,45 | 5 | 006 | 14,53 | 0,00 | 6 | 005 | 0,33 | -0,51 | 7 | 006 | 15,71 | -4,00 | 8 | 005 | 1,94 | -2,62 | 9 | 005 | -0,70 | -1,13 | 10 | 004 | -5,34 | -6,39 | 11 | 006 | 4,36 | -4,00 | 12 | 005 | -9,34 | -9,34| | 1 | 004 | 1,08 | -1,02 | 2 | 004 | 9,23 | 0,00 | 3 | 005 | 6,36 | 0,00 | 4 | 004 | 10,41 | 0,00 | 5 | 005 | 0,45 | 0,00 | 6 | 002 | -3,40 | -3,40
//    |GMKN|5 дня падения, 6 дня в op:buy  p:10,00 s: 4,00|ROSN|Max Williams A/D | 3|4|2|op:sell p:10,00 s: 4,00|GMKN|2 дня роста, 2 дня в op:sell p:10,00 s: 4,00|ROSN|Min Williams A/D |12|3|3|op:buy  p:10,00 s: 4,00| | 2010|034|024|  67,68|-3,12| -7,73|2011|039|026|  48,00|-7,85|-11,17|2012|035|026|  42,97|-3,64| -9,34|2013|019|005|  32,77|-1,02| -1,02 |  | 1 | 003 | 8,27 | -3,12 | 2 | 004 | 15,53 | 0,00 | 3 | 006 | 4,82 | -2,56 | 4 | 004 | 6,18 | -4,00 | 5 | 004 | 22,55 | 0,00 | 6 | 005 | 5,76 | 0,00 | 7 | 007 | 10,32 | 0,00 | 8 | 005 | -0,97 | -0,97 | 9 | 004 | 1,36 | -0,70 | 10 | 005 | 1,23 | -2,43 | 11 | 005 | 0,36 | -1,87 | 12 | 006 | -7,73 | -7,73| | 1 | 004 | -7,85 | -7,85 | 2 | 004 | 6,16 | 0,00 | 3 | 004 | 3,43 | 0,00 | 4 | 006 | 11,58 | 0,00 | 5 | 005 | 6,89 | 0,00 | 6 | 005 | -1,37 | -1,37 | 7 | 005 | 6,00 | 0,00 | 8 | 008 | -6,50 | -11,17 | 9 | 009 | 24,45 | -1,86 | 10 | 005 | -5,51 | -8,17 | 11 | 005 | 6,76 | -4,00 | 12 | 005 | 3,97 | 0,00| | 1 | 004 | -1,03 | -3,64 | 2 | 006 | 10,21 | 0,00 | 3 | 005 | 9,12 | 0,00 | 4 | 004 | 3,17 | -1,45 | 5 | 006 | 14,53 | 0,00 | 6 | 005 | 0,33 | -0,51 | 7 | 006 | 15,71 | -4,00 | 8 | 005 | 1,94 | -2,62 | 9 | 005 | -0,70 | -1,13 | 10 | 004 | -5,34 | -6,39 | 11 | 006 | 4,36 | -4,00 | 12 | 005 | -9,34 | -9,34| | 1 | 004 | 1,08 | -1,02 | 2 | 004 | 9,23 | 0,00 | 3 | 005 | 6,36 | 0,00 | 4 | 004 | 10,41 | 0,00 | 5 | 005 | 0,45 | 0,00 | 6 | 002 | 5,23 | 0,00
    test("gmkn VS rosn"){ checkCombination(williams.rosnBestStrategies, DayStandardImporter.rosn, 42) }
    //    нет ничего
    test("gmkn VS rtkm"){ checkCombination(williams.rtkmBestStrategies, DayStandardImporter.rtkm, 30) }
//    |SBER|Max Williams A/D | 3|3|2|op:sell p:10,00 s: 4,00|GMKN|2 дня роста, 2 дня в op:sell p:10,00 s: 4,00|GMKN|3 дня падения, 6 дня в op:buy  p:10,00 s: 4,00|SBER|Min Williams A/D | 3|7|2|op:buy  p:10,00 s: 4,00| | 2010|036|026|  51,73|-5,87|-11,17|2011|035|029|  56,94|-14,20|-15,33|2012|035|024|  54,90|-4,46| -5,19|2013|014|009|  29,29|-1,53| -5,06 |  | 1 | 004 | -5,87 | -5,87 | 2 | 007 | 27,32 | 0,00 | 3 | 005 | 0,10 | -5,94 | 4 | 005 | -3,44 | -3,44 | 5 | 006 | -9,88 | -11,17 | 6 | 005 | 1,28 | -4,00 | 7 | 006 | 7,63 | -4,00 | 8 | 005 | 4,96 | -2,26 | 9 | 006 | 8,72 | -4,43 | 10 | 005 | 8,10 | 0,00 | 11 | 003 | 8,32 | 0,00 | 12 | 005 | 4,48 | -4,00| | 1 | 002 | 1,14 | 0,00 | 2 | 005 | -11,91 | -15,33 | 3 | 004 | 9,48 | 0,00 | 4 | 006 | -6,78 | -6,78 | 5 | 003 | 7,30 | 0,00 | 6 | 005 | 5,35 | 0,00 | 7 | 005 | -0,58 | -4,00 | 8 | 008 | 9,32 | -7,72 | 9 | 008 | 23,35 | -2,77 | 10 | 005 | 11,33 | -4,19 | 11 | 007 | -8,50 | -8,50 | 12 | 006 | 17,44 | 0,00| | 1 | 006 | 8,15 | -0,92 | 2 | 006 | -3,98 | -3,98 | 3 | 005 | -5,19 | -5,19 | 4 | 005 | -2,55 | -2,55 | 5 | 005 | 10,87 | -0,89 | 6 | 004 | 13,61 | 0,00 | 7 | 006 | 10,66 | 0,00 | 8 | 004 | 1,76 | 0,00 | 9 | 004 | -2,66 | -2,66 | 10 | 004 | 0,41 | -0,67 | 11 | 007 | 14,96 | 0,00 | 12 | 003 | 8,85 | 0,00| | 1 | 004 | 3,78 | -1,46 | 2 | 004 | 3,49 | 0,00 | 3 | 003 | -5,06 | -5,06 | 4 | 006 | 1,81 | -3,73 | 5 | 004 | 19,00 | 0,00 | 6 | 002 | 6,27 | 0,00
//    |SBER|Max Williams A/D | 3|3|2|op:sell p:10,00 s: 4,00|GMKN|3 дня падения, 6 дня в op:buy  p:10,00 s: 4,00|GMKN|2 дня роста, 2 дня в op:sell p:10,00 s: 4,00|SBER|Min Williams A/D | 3|7|2|op:buy  p:10,00 s: 4,00| | 2010|036|026|  51,73|-5,87|-11,17|2011|035|029|  56,94|-14,20|-15,33|2012|035|024|  54,90|-4,46| -5,19|2013|014|009|  29,29|-1,53| -5,06 |  | 1 | 004 | -5,87 | -5,87 | 2 | 007 | 27,32 | 0,00 | 3 | 005 | 0,10 | -5,94 | 4 | 005 | -3,44 | -3,44 | 5 | 006 | -9,88 | -11,17 | 6 | 005 | 1,28 | -4,00 | 7 | 006 | 7,63 | -4,00 | 8 | 005 | 4,96 | -2,26 | 9 | 006 | 8,72 | -4,43 | 10 | 005 | 8,10 | 0,00 | 11 | 003 | 8,32 | 0,00 | 12 | 005 | 4,48 | -4,00| | 1 | 002 | 1,14 | 0,00 | 2 | 005 | -11,91 | -15,33 | 3 | 004 | 9,48 | 0,00 | 4 | 006 | -6,78 | -6,78 | 5 | 003 | 7,30 | 0,00 | 6 | 005 | 5,35 | 0,00 | 7 | 005 | -0,58 | -4,00 | 8 | 008 | 9,32 | -7,72 | 9 | 008 | 23,35 | -2,77 | 10 | 005 | 11,33 | -4,19 | 11 | 007 | -8,50 | -8,50 | 12 | 006 | 17,44 | 0,00| | 1 | 006 | 8,15 | -0,92 | 2 | 006 | -3,98 | -3,98 | 3 | 005 | -5,19 | -5,19 | 4 | 005 | -2,55 | -2,55 | 5 | 005 | 10,87 | -0,89 | 6 | 004 | 13,61 | 0,00 | 7 | 006 | 10,66 | 0,00 | 8 | 004 | 1,76 | 0,00 | 9 | 004 | -2,66 | -2,66 | 10 | 004 | 0,41 | -0,67 | 11 | 007 | 14,96 | 0,00 | 12 | 003 | 8,85 | 0,00| | 1 | 004 | 3,78 | -1,46 | 2 | 004 | 3,49 | 0,00 | 3 | 003 | -5,06 | -5,06 | 4 | 006 | 1,81 | -3,73 | 5 | 004 | 19,00 | 0,00 | 6 | 002 | 6,27 | 0,00
    test("gmkn VS sber"){ checkCombination(williams.sberBestStrategies, DayStandardImporter.sber, 50) }

    override val trendData = DayStandardImporter.gmkn
    override val trendStrategies = new SimpleTrendSuccessfulStrategies{}.gmknBestStrategies
}
