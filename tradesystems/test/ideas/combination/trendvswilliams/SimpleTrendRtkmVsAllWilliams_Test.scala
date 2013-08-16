package ideas.combination.trendvswilliams

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import tradingideas.{WilliamsAdMin, WilliamsAdMax}
import tradingsystems.TradingData
import tradinganalyzers.statistics.DayStandardImporter
import ideas.combination.trendvstrend.SimpleTrendSuccessfulStrategies

/**
 * @author alespuh
 * @since 31.07.13
 */
@RunWith(classOf[JUnitRunner])
class SimpleTrendRtkmVsAllWilliams_Test extends FunSuite with SimpleTrendVsWilliams
{
//    nothing interesting
    test("rtkm VS rtkm"){ checkCombination(williams.rtkmBestStrategies, DayStandardImporter.rtkm, 30) }
    //    nothing interesting
    test("rtkm VS gazp"){ checkCombination(williams.gazpBestStrategies, DayStandardImporter.gazp, 30) }
//    |RTKM|2 дня падения, 4 дня в op:buy  p:12,00 s: 5,00|GMKN|Max Williams A/D | 3|5|1|op:sell p:12,00 s: 5,00|RTKM|3 дня роста, 6 дня в op:sell p:12,00 s: 5,00|GMKN|Min Williams A/D | 3|4|1|op:buy  p:12,00 s: 5,00| | 2010|030|029|  45,38|0,00|-15,66|2011|036|027|  46,42|-10,12|-13,32|2012|032|022|  45,43|0,00| -7,85|2013|012|012|  28,91|-0,27| -4,90 |  | 1 | 003 | 14,96 | 0,00 | 2 | 005 | 10,71 | 0,00 | 3 | 004 | -0,23 | -3,38 | 4 | 006 | -15,66 | -15,66 | 5 | 006 | 0,21 | -8,00 | 6 | 004 | 22,96 | 0,00 | 7 | 005 | 13,47 | 0,00 | 8 | 006 | 4,74 | -2,55 | 9 | 005 | -9,96 | -9,96 | 10 | 005 | -1,23 | -3,22 | 11 | 005 | 9,86 | -5,00 | 12 | 005 | -4,45 | -4,45| | 1 | 003 | 3,21 | 0,00 | 2 | 005 | -5,89 | -13,32 | 3 | 005 | 14,00 | 0,00 | 4 | 005 | 9,82 | -4,29 | 5 | 005 | 14,98 | 0,00 | 6 | 004 | 8,76 | 0,00 | 7 | 005 | -1,45 | -1,45 | 8 | 008 | 1,66 | -10,19 | 9 | 007 | 8,79 | -7,72 | 10 | 004 | -1,45 | -1,45 | 11 | 006 | -9,37 | -9,37 | 12 | 006 | 3,36 | -2,80| | 1 | 004 | 5,52 | 0,00 | 2 | 005 | 5,12 | -0,41 | 3 | 004 | 11,11 | 0,00 | 4 | 005 | 11,39 | -2,08 | 5 | 004 | 10,28 | 0,00 | 6 | 004 | 0,32 | -4,84 | 7 | 005 | -7,16 | -7,16 | 8 | 004 | -1,35 | -7,85 | 9 | 005 | 7,78 | 0,00 | 10 | 005 | 4,77 | 0,00 | 11 | 005 | -3,29 | -5,00 | 12 | 004 | 0,94 | -5,46| | 1 | 004 | 2,60 | -0,27 | 2 | 004 | 3,64 | 0,00 | 3 | 005 | 2,84 | -4,06 | 4 | 005 | 22,30 | -4,90 | 5 | 005 | -0,72 | -4,10 | 6 | 001 | -1,76 | -1,76
//    |RTKM|2 дня падения, 4 дня в op:buy  p:13,00 s: 5,00|GMKN|Max Williams A/D | 3|5|1|op:sell p:13,00 s: 5,00|RTKM|3 дня роста, 6 дня в op:sell p:13,00 s: 5,00|GMKN|Min Williams A/D | 3|4|1|op:buy  p:13,00 s: 5,00| | 2010|030|029|  45,77|0,00|-15,66|2011|036|026|  53,42|-10,12|-13,32|2012|032|022|  45,43|0,00| -7,85|2013|012|012|  29,91|-0,27| -4,90 |  | 1 | 003 | 14,96 | 0,00 | 2 | 005 | 10,71 | 0,00 | 3 | 004 | -0,23 | -3,38 | 4 | 006 | -15,66 | -15,66 | 5 | 006 | 1,21 | -7,00 | 6 | 004 | 22,96 | 0,00 | 7 | 005 | 13,47 | 0,00 | 8 | 006 | 4,74 | -2,55 | 9 | 005 | -9,96 | -9,96 | 10 | 005 | -1,23 | -3,22 | 11 | 005 | 9,25 | -5,00 | 12 | 005 | -4,45 | -4,45| | 1 | 003 | 3,21 | 0,00 | 2 | 005 | -5,89 | -13,32 | 3 | 005 | 14,00 | 0,00 | 4 | 005 | 9,82 | -4,29 | 5 | 005 | 14,98 | 0,00 | 6 | 004 | 8,76 | 0,00 | 7 | 005 | -1,45 | -1,45 | 8 | 008 | 1,66 | -10,19 | 9 | 006 | 15,79 | -7,72 | 10 | 004 | -1,45 | -1,45 | 11 | 006 | -9,37 | -9,37 | 12 | 006 | 3,36 | -2,80| | 1 | 004 | 5,52 | 0,00 | 2 | 005 | 5,12 | -0,41 | 3 | 004 | 11,11 | 0,00 | 4 | 005 | 11,39 | -2,08 | 5 | 004 | 10,28 | 0,00 | 6 | 004 | 0,32 | -4,84 | 7 | 005 | -7,16 | -7,16 | 8 | 004 | -1,35 | -7,85 | 9 | 005 | 7,78 | 0,00 | 10 | 005 | 4,77 | 0,00 | 11 | 005 | -3,29 | -5,00 | 12 | 004 | 0,94 | -5,46| | 1 | 004 | 2,60 | -0,27 | 2 | 004 | 3,64 | 0,00 | 3 | 005 | 2,84 | -4,06 | 4 | 005 | 23,30 | -4,90 | 5 | 005 | -0,72 | -4,10 | 6 | 001 | -1,76 | -1,76
    test("rtkm VS gmkn"){ checkCombination(williams.gmknBestStrategies, DayStandardImporter.gmkn, 45) }
//    |LKOH|Min Williams A/D | 3|4|1|op:buy  p:10,00 s: 5,00|LKOH|Max Williams A/D | 3|5|2|op:sell p:10,00 s: 5,00|RTKM|2 дня роста, 6 дня в op:sell p:10,00 s: 5,00|RTKM|2 дня падения, 7 дня в op:buy  p:10,00 s: 5,00| | 2010|034|020|  61,69|0,00| -7,01|2011|034|021|  66,22|-8,63|-10,00|2012|030|019|  53,78|-4,72| -5,63|2013|015|008|  23,39|-0,73| -6,29 |  | 1 | 003 | 17,85 | 0,00 | 2 | 005 | 1,37 | -1,70 | 3 | 005 | -7,01 | -7,01 | 4 | 004 | 9,58 | -0,83 | 5 | 006 | -0,32 | -6,97 | 6 | 005 | 6,40 | 0,00 | 7 | 005 | 2,74 | -0,12 | 8 | 004 | 9,73 | -2,56 | 9 | 004 | 8,28 | -1,96 | 10 | 004 | 3,76 | 0,00 | 11 | 005 | 3,69 | -1,12 | 12 | 004 | 5,61 | 0,00| | 1 | 004 | -2,60 | -8,63 | 2 | 004 | 9,58 | -0,42 | 3 | 004 | 11,35 | 0,00 | 4 | 005 | 0,97 | -9,24 | 5 | 004 | -2,10 | -3,35 | 6 | 005 | 4,01 | -0,15 | 7 | 003 | 1,72 | -2,39 | 8 | 007 | 8,16 | -0,00 | 9 | 005 | 28,99 | 0,00 | 10 | 004 | 8,21 | 0,00 | 11 | 005 | 6,02 | 0,00 | 12 | 005 | -8,09 | -10,00| | 1 | 005 | -0,60 | -4,72 | 2 | 003 | 13,43 | 0,00 | 3 | 004 | 7,98 | -0,76 | 4 | 004 | 4,52 | -0,91 | 5 | 005 | 16,27 | 0,00 | 6 | 004 | 1,48 | -5,63 | 7 | 005 | -1,96 | -4,32 | 8 | 004 | -3,18 | -5,40 | 9 | 003 | -2,36 | -5,00 | 10 | 004 | 5,41 | 0,00 | 11 | 004 | 14,15 | 0,00 | 12 | 004 | -1,35 | -1,82| | 1 | 004 | 0,36 | -0,73 | 2 | 005 | 7,27 | 0,00 | 3 | 003 | 5,32 | 0,00 | 4 | 006 | 16,99 | 0,00 | 5 | 004 | -6,29 | -6,29 | 6 | 001 | -0,27 | -0,27
//    |LKOH|Min Williams A/D | 3|4|1|op:buy  p:10,00 s: 5,00|LKOH|Max Williams A/D | 3|5|2|op:sell p:10,00 s: 5,00|RTKM|2 дня падения, 7 дня в op:buy  p:10,00 s: 5,00|RTKM|2 дня роста, 6 дня в op:sell p:10,00 s: 5,00| | 2010|034|020|  61,69|0,00| -7,01|2011|034|021|  66,22|-8,63|-10,00|2012|030|019|  53,78|-4,72| -5,63|2013|015|008|  23,39|-0,73| -6,29 |  | 1 | 003 | 17,85 | 0,00 | 2 | 005 | 1,37 | -1,70 | 3 | 005 | -7,01 | -7,01 | 4 | 004 | 9,58 | -0,83 | 5 | 006 | -0,32 | -6,97 | 6 | 005 | 6,40 | 0,00 | 7 | 005 | 2,74 | -0,12 | 8 | 004 | 9,73 | -2,56 | 9 | 004 | 8,28 | -1,96 | 10 | 004 | 3,76 | 0,00 | 11 | 005 | 3,69 | -1,12 | 12 | 004 | 5,61 | 0,00| | 1 | 004 | -2,60 | -8,63 | 2 | 004 | 9,58 | -0,42 | 3 | 004 | 11,35 | 0,00 | 4 | 005 | 0,97 | -9,24 | 5 | 004 | -2,10 | -3,35 | 6 | 005 | 4,01 | -0,15 | 7 | 003 | 1,72 | -2,39 | 8 | 007 | 8,16 | -0,00 | 9 | 005 | 28,99 | 0,00 | 10 | 004 | 8,21 | 0,00 | 11 | 005 | 6,02 | 0,00 | 12 | 005 | -8,09 | -10,00| | 1 | 005 | -0,60 | -4,72 | 2 | 003 | 13,43 | 0,00 | 3 | 004 | 7,98 | -0,76 | 4 | 004 | 4,52 | -0,91 | 5 | 005 | 16,27 | 0,00 | 6 | 004 | 1,48 | -5,63 | 7 | 005 | -1,96 | -4,32 | 8 | 004 | -3,18 | -5,40 | 9 | 003 | -2,36 | -5,00 | 10 | 004 | 5,41 | 0,00 | 11 | 004 | 14,15 | 0,00 | 12 | 004 | -1,35 | -1,82| | 1 | 004 | 0,36 | -0,73 | 2 | 005 | 7,27 | 0,00 | 3 | 003 | 5,32 | 0,00 | 4 | 006 | 16,99 | 0,00 | 5 | 004 | -6,29 | -6,29 | 6 | 001 | -0,27 | -0,27
//    |LKOH|Min Williams A/D | 3|4|1|op:buy  p:11,00 s: 5,00|LKOH|Max Williams A/D | 3|5|2|op:sell p:11,00 s: 5,00|RTKM|2 дня роста, 6 дня в op:sell p:11,00 s: 5,00|RTKM|2 дня падения, 7 дня в op:buy  p:11,00 s: 5,00| | 2010|033|020|  55,11|0,00|-16,55|2011|034|021|  68,53|-8,63|-10,00|2012|030|019|  53,78|-4,72| -5,63|2013|015|008|  24,39|-0,73| -6,29 |  | 1 | 003 | 18,85 | 0,00 | 2 | 005 | 1,37 | -1,70 | 3 | 005 | -7,01 | -7,01 | 4 | 004 | 10,58 | -0,83 | 5 | 005 | -9,90 | -16,55 | 6 | 005 | 6,40 | 0,00 | 7 | 005 | 2,74 | -0,12 | 8 | 004 | 10,73 | -2,56 | 9 | 004 | 8,28 | -1,96 | 10 | 004 | 3,76 | 0,00 | 11 | 005 | 3,69 | -1,12 | 12 | 004 | 5,61 | 0,00| | 1 | 004 | -2,60 | -8,63 | 2 | 004 | 8,36 | -0,42 | 3 | 004 | 11,35 | 0,00 | 4 | 005 | 0,97 | -9,24 | 5 | 004 | -2,10 | -3,35 | 6 | 005 | 4,01 | -0,15 | 7 | 003 | 1,72 | -2,39 | 8 | 007 | 10,16 | 0,00 | 9 | 005 | 29,52 | 0,00 | 10 | 004 | 9,21 | 0,00 | 11 | 005 | 6,02 | 0,00 | 12 | 005 | -8,09 | -10,00| | 1 | 005 | -0,60 | -4,72 | 2 | 003 | 13,43 | 0,00 | 3 | 004 | 7,98 | -0,76 | 4 | 004 | 4,52 | -0,91 | 5 | 005 | 16,27 | 0,00 | 6 | 004 | 1,48 | -5,63 | 7 | 005 | -1,96 | -4,32 | 8 | 004 | -3,18 | -5,40 | 9 | 003 | -2,36 | -5,00 | 10 | 004 | 5,41 | 0,00 | 11 | 004 | 14,15 | 0,00 | 12 | 004 | -1,35 | -1,82| | 1 | 004 | 0,36 | -0,73 | 2 | 005 | 7,27 | 0,00 | 3 | 003 | 5,32 | 0,00 | 4 | 006 | 17,99 | 0,00 | 5 | 004 | -6,29 | -6,29 | 6 | 001 | -0,27 | -0,27
//    |LKOH|Min Williams A/D | 3|4|1|op:buy  p:11,00 s: 5,00|LKOH|Max Williams A/D | 3|5|2|op:sell p:11,00 s: 5,00|RTKM|2 дня падения, 7 дня в op:buy  p:11,00 s: 5,00|RTKM|2 дня роста, 6 дня в op:sell p:11,00 s: 5,00| | 2010|033|020|  55,11|0,00|-16,55|2011|034|021|  68,53|-8,63|-10,00|2012|030|019|  53,78|-4,72| -5,63|2013|015|008|  24,39|-0,73| -6,29 |  | 1 | 003 | 18,85 | 0,00 | 2 | 005 | 1,37 | -1,70 | 3 | 005 | -7,01 | -7,01 | 4 | 004 | 10,58 | -0,83 | 5 | 005 | -9,90 | -16,55 | 6 | 005 | 6,40 | 0,00 | 7 | 005 | 2,74 | -0,12 | 8 | 004 | 10,73 | -2,56 | 9 | 004 | 8,28 | -1,96 | 10 | 004 | 3,76 | 0,00 | 11 | 005 | 3,69 | -1,12 | 12 | 004 | 5,61 | 0,00| | 1 | 004 | -2,60 | -8,63 | 2 | 004 | 8,36 | -0,42 | 3 | 004 | 11,35 | 0,00 | 4 | 005 | 0,97 | -9,24 | 5 | 004 | -2,10 | -3,35 | 6 | 005 | 4,01 | -0,15 | 7 | 003 | 1,72 | -2,39 | 8 | 007 | 10,16 | 0,00 | 9 | 005 | 29,52 | 0,00 | 10 | 004 | 9,21 | 0,00 | 11 | 005 | 6,02 | 0,00 | 12 | 005 | -8,09 | -10,00| | 1 | 005 | -0,60 | -4,72 | 2 | 003 | 13,43 | 0,00 | 3 | 004 | 7,98 | -0,76 | 4 | 004 | 4,52 | -0,91 | 5 | 005 | 16,27 | 0,00 | 6 | 004 | 1,48 | -5,63 | 7 | 005 | -1,96 | -4,32 | 8 | 004 | -3,18 | -5,40 | 9 | 003 | -2,36 | -5,00 | 10 | 004 | 5,41 | 0,00 | 11 | 004 | 14,15 | 0,00 | 12 | 004 | -1,35 | -1,82| | 1 | 004 | 0,36 | -0,73 | 2 | 005 | 7,27 | 0,00 | 3 | 003 | 5,32 | 0,00 | 4 | 006 | 17,99 | 0,00 | 5 | 004 | -6,29 | -6,29 | 6 | 001 | -0,27 | -0,27
//    |LKOH|Max Williams A/D | 3|5|2|op:sell p:13,00 s: 3,00|RTKM|3 дня роста, 6 дня в op:sell p:13,00 s: 3,00|LKOH|Min Williams A/D | 3|4|1|op:buy  p:13,00 s: 3,00|RTKM|2 дня падения, 4 дня в op:buy  p:13,00 s: 3,00| | 2010|036|025|  48,94|0,00|-15,00|2011|029|029|  47,66|-8,08| -7,82|2012|033|019|  52,86|-5,96| -5,96|2013|015|010|  36,14|0,00| -5,91 |  | 1 | 004 | 15,42 | 0,00 | 2 | 005 | 11,13 | 0,00 | 3 | 005 | -0,16 | -0,65 | 4 | 005 | -0,65 | -3,00 | 5 | 006 | -6,90 | -13,55 | 6 | 007 | -3,61 | -15,00 | 7 | 005 | 3,92 | 0,00 | 8 | 004 | 11,25 | -1,75 | 9 | 005 | 2,77 | -4,90 | 10 | 004 | 6,37 | 0,00 | 11 | 006 | 4,11 | -2,74 | 12 | 005 | 5,28 | -3,00| | 1 | 004 | -7,53 | -7,53 | 2 | 005 | 6,89 | -0,54 | 3 | 005 | 7,80 | 0,00 | 4 | 005 | 12,02 | -0,24 | 5 | 005 | -4,03 | -6,00 | 6 | 004 | -4,21 | -4,21 | 7 | 005 | -4,83 | -5,52 | 8 | 005 | 14,19 | 0,00 | 9 | 005 | 25,71 | -0,40 | 10 | 005 | 1,46 | 0,00 | 11 | 005 | 8,02 | 0,00 | 12 | 005 | -7,82 | -7,82| | 1 | 005 | -1,48 | -5,96 | 2 | 004 | 0,07 | 0,00 | 3 | 004 | 5,18 | -0,76 | 4 | 004 | 3,39 | -0,91 | 5 | 006 | 15,46 | 0,00 | 6 | 004 | 3,48 | -3,63 | 7 | 005 | 8,59 | -1,04 | 8 | 004 | 0,47 | -3,00 | 9 | 004 | 5,06 | -0,08 | 10 | 004 | 0,15 | -1,97 | 11 | 004 | 11,57 | 0,00 | 12 | 004 | 0,91 | -4,89| | 1 | 004 | 8,56 | 0,00 | 2 | 005 | 6,35 | -0,39 | 3 | 004 | 4,70 | -1,60 | 4 | 006 | 19,99 | 0,00 | 5 | 005 | -3,20 | -5,91 | 6 | 001 | -0,27 | -0,27
    test("rtkm VS lkoh"){ checkCombination(williams.lkohBestStrategies, DayStandardImporter.lkoh, 47) }
//    |RTKM|2 дня падения, 2 дня в op:buy  p:11,00 s: 4,00|NVTK|Max Williams A/D | 6|7|3|op:sell p:11,00 s: 4,00|NVTK|Min Williams A/D | 6|7|1|op:buy  p:11,00 s: 4,00|RTKM|2 дня роста, 6 дня в op:sell p:11,00 s: 4,00| | 2010|030|025|  52,03|0,00|-13,60|2011|029|030|  48,91|-23,89|-15,65|2012|029|020|  47,30|-0,72| -8,00|2013|012|011|  24,76|0,00|-13,19 |  | 1 | 004 | 14,62 | 0,00 | 2 | 003 | 23,71 | 0,00 | 3 | 004 | 2,81 | -4,00 | 4 | 006 | 2,36 | -8,64 | 5 | 008 | -2,42 | -8,00 | 6 | 003 | 5,68 | -4,00 | 7 | 004 | -3,87 | -6,01 | 8 | 003 | -3,26 | -3,26 | 9 | 007 | -12,36 | -13,60 | 10 | 003 | 1,37 | 0,00 | 11 | 005 | 11,04 | -4,12 | 12 | 005 | 12,35 | 0,00| | 1 | 002 | -2,11 | -4,00 | 2 | 004 | -5,02 | -5,02 | 3 | 006 | -15,65 | -15,65 | 4 | 004 | 2,89 | 0,00 | 5 | 005 | 6,56 | -4,00 | 6 | 004 | 5,09 | 0,00 | 7 | 004 | 13,94 | 0,00 | 8 | 007 | 19,34 | 0,00 | 9 | 006 | 19,88 | -3,68 | 10 | 008 | -0,93 | -4,00 | 11 | 004 | 7,64 | 0,00 | 12 | 005 | -2,72 | -4,56| | 1 | 005 | 2,96 | -0,72 | 2 | 004 | 9,01 | 0,00 | 3 | 004 | -0,12 | -0,97 | 4 | 003 | 6,36 | 0,00 | 5 | 004 | 22,27 | 0,00 | 6 | 004 | 10,03 | -8,00 | 7 | 004 | 12,42 | 0,00 | 8 | 005 | -6,93 | -8,00 | 9 | 003 | 1,67 | -0,87 | 10 | 005 | -6,41 | -6,41 | 11 | 003 | -0,08 | -0,08 | 12 | 005 | -3,88 | -3,88| | 1 | 003 | 7,70 | 0,00 | 2 | 004 | 7,56 | -1,98 | 3 | 004 | 3,85 | 0,00 | 4 | 007 | -13,19 | -13,19 | 5 | 004 | 17,31 | 0,00 | 6 | 001 | 1,52 | 0,00
//    |RTKM|2 дня роста, 6 дня в op:sell p:11,00 s: 4,00|RTKM|2 дня падения, 2 дня в op:buy  p:11,00 s: 4,00|NVTK|Max Williams A/D | 6|7|3|op:sell p:11,00 s: 4,00|NVTK|Min Williams A/D | 6|7|1|op:buy  p:11,00 s: 4,00| | 2010|031|027|  47,44|0,00|-14,09|2011|029|031|  48,03|-17,62| -9,56|2012|028|020|  47,54|-0,72| -8,00|2013|013|011|  26,01|0,00|-15,07 |  | 1 | 004 | 14,62 | 0,00 | 2 | 003 | 23,71 | 0,00 | 3 | 004 | -3,77 | -8,22 | 4 | 007 | 6,45 | -4,55 | 5 | 008 | -2,42 | -8,00 | 6 | 003 | 5,68 | -4,00 | 7 | 004 | -3,05 | -6,01 | 8 | 005 | -1,04 | -1,04 | 9 | 007 | -12,86 | -14,09 | 10 | 003 | 1,37 | 0,00 | 11 | 005 | 11,04 | -4,12 | 12 | 005 | 7,70 | 0,00| | 1 | 004 | -0,25 | -8,00 | 2 | 004 | -5,02 | -5,02 | 3 | 005 | -7,12 | -8,42 | 4 | 004 | -1,23 | -3,89 | 5 | 005 | 6,56 | -4,00 | 6 | 004 | 5,09 | 0,00 | 7 | 004 | 13,94 | 0,00 | 8 | 007 | 19,34 | 0,00 | 9 | 006 | 19,88 | -3,68 | 10 | 008 | -0,93 | -4,00 | 11 | 004 | 7,33 | 0,00 | 12 | 005 | -9,56 | -9,56| | 1 | 005 | 2,96 | -0,72 | 2 | 003 | 6,50 | 0,00 | 3 | 004 | -0,12 | -0,97 | 4 | 003 | 6,36 | 0,00 | 5 | 004 | 22,27 | 0,00 | 6 | 004 | 10,03 | -8,00 | 7 | 004 | 12,42 | 0,00 | 8 | 005 | -6,93 | -8,00 | 9 | 003 | 1,67 | -0,87 | 10 | 005 | -6,41 | -6,41 | 11 | 003 | 2,67 | 0,00 | 12 | 005 | -3,88 | -3,88| | 1 | 004 | 10,67 | 0,00 | 2 | 004 | 7,56 | -1,98 | 3 | 003 | 4,06 | 0,00 | 4 | 008 | -8,92 | -15,07 | 5 | 004 | 11,12 | -3,32 | 6 | 001 | 1,52 | 0,00
//    |RTKM|2 дня падения, 2 дня в op:buy  p:11,00 s: 4,00|RTKM|2 дня роста, 6 дня в op:sell p:11,00 s: 4,00|NVTK|Max Williams A/D | 6|7|3|op:sell p:11,00 s: 4,00|NVTK|Min Williams A/D | 6|7|1|op:buy  p:11,00 s: 4,00| | 2010|031|027|  47,44|0,00|-14,09|2011|029|031|  48,03|-17,62| -9,56|2012|028|020|  47,54|-0,72| -8,00|2013|013|011|  26,01|0,00|-15,07 |  | 1 | 004 | 14,62 | 0,00 | 2 | 003 | 23,71 | 0,00 | 3 | 004 | -3,77 | -8,22 | 4 | 007 | 6,45 | -4,55 | 5 | 008 | -2,42 | -8,00 | 6 | 003 | 5,68 | -4,00 | 7 | 004 | -3,05 | -6,01 | 8 | 005 | -1,04 | -1,04 | 9 | 007 | -12,86 | -14,09 | 10 | 003 | 1,37 | 0,00 | 11 | 005 | 11,04 | -4,12 | 12 | 005 | 7,70 | 0,00| | 1 | 004 | -0,25 | -8,00 | 2 | 004 | -5,02 | -5,02 | 3 | 005 | -7,12 | -8,42 | 4 | 004 | -1,23 | -3,89 | 5 | 005 | 6,56 | -4,00 | 6 | 004 | 5,09 | 0,00 | 7 | 004 | 13,94 | 0,00 | 8 | 007 | 19,34 | 0,00 | 9 | 006 | 19,88 | -3,68 | 10 | 008 | -0,93 | -4,00 | 11 | 004 | 7,33 | 0,00 | 12 | 005 | -9,56 | -9,56| | 1 | 005 | 2,96 | -0,72 | 2 | 003 | 6,50 | 0,00 | 3 | 004 | -0,12 | -0,97 | 4 | 003 | 6,36 | 0,00 | 5 | 004 | 22,27 | 0,00 | 6 | 004 | 10,03 | -8,00 | 7 | 004 | 12,42 | 0,00 | 8 | 005 | -6,93 | -8,00 | 9 | 003 | 1,67 | -0,87 | 10 | 005 | -6,41 | -6,41 | 11 | 003 | 2,67 | 0,00 | 12 | 005 | -3,88 | -3,88| | 1 | 004 | 10,67 | 0,00 | 2 | 004 | 7,56 | -1,98 | 3 | 003 | 4,06 | 0,00 | 4 | 008 | -8,92 | -15,07 | 5 | 004 | 11,12 | -3,32 | 6 | 001 | 1,52 | 0,00
//    |NVTK|Max Williams A/D | 6|7|3|op:sell p:11,00 s: 4,00|NVTK|Min Williams A/D | 9|7|1|op:buy  p:11,00 s: 4,00|RTKM|2 дня роста, 6 дня в op:sell p:11,00 s: 4,00|RTKM|2 дня падения, 2 дня в op:buy  p:11,00 s: 4,00| | 2010|025|020|  49,52|0,00| -8,00|2011|029|025|  56,67|-14,96| -8,00|2012|025|019|  51,60|-4,72| -8,00|2013|010|009|  23,47|0,00| -6,83 |  | 1 | 004 | 14,62 | 0,00 | 2 | 003 | 23,71 | 0,00 | 3 | 003 | 1,32 | -4,00 | 4 | 004 | 8,42 | -2,58 | 5 | 004 | 5,46 | -4,00 | 6 | 003 | 5,68 | -4,00 | 7 | 003 | 0,65 | -0,03 | 8 | 004 | -3,91 | -3,91 | 9 | 004 | -6,73 | -8,00 | 10 | 004 | -0,70 | -0,72 | 11 | 005 | 5,58 | -8,00 | 12 | 004 | -4,58 | -4,58| | 1 | 003 | 6,25 | 0,00 | 2 | 004 | -5,02 | -5,02 | 3 | 006 | -5,62 | -8,00 | 4 | 004 | -5,76 | -5,76 | 5 | 004 | -2,63 | -4,80 | 6 | 004 | -0,31 | -0,31 | 7 | 004 | 13,94 | 0,00 | 8 | 005 | 25,43 | 0,00 | 9 | 005 | 25,00 | -8,00 | 10 | 008 | -7,87 | -7,87 | 11 | 003 | 8,43 | -4,00 | 12 | 004 | 4,85 | 0,00| | 1 | 005 | -4,72 | -4,72 | 2 | 002 | 8,31 | 0,00 | 3 | 004 | 2,47 | -0,97 | 4 | 003 | -1,95 | -4,30 | 5 | 004 | 22,27 | 0,00 | 6 | 004 | 10,03 | -8,00 | 7 | 004 | 12,46 | 0,00 | 8 | 005 | -6,93 | -8,00 | 9 | 003 | 1,67 | -0,87 | 10 | 003 | 12,34 | 0,00 | 11 | 003 | -0,08 | -0,08 | 12 | 004 | -4,28 | -4,28| | 1 | 003 | 7,70 | 0,00 | 2 | 003 | 1,43 | -2,82 | 3 | 003 | 7,85 | 0,00 | 4 | 005 | -6,83 | -6,83 | 5 | 004 | 17,31 | 0,00 | 6 | 001 | -4,00 | -4,00
//    |NVTK|Max Williams A/D | 6|7|3|op:sell p:11,00 s: 4,00|NVTK|Min Williams A/D | 9|7|1|op:buy  p:11,00 s: 4,00|RTKM|2 дня падения, 2 дня в op:buy  p:11,00 s: 4,00|RTKM|2 дня роста, 6 дня в op:sell p:11,00 s: 4,00| | 2010|025|020|  49,52|0,00| -8,00|2011|029|025|  56,67|-14,96| -8,00|2012|025|019|  51,60|-4,72| -8,00|2013|010|009|  23,47|0,00| -6,83 |  | 1 | 004 | 14,62 | 0,00 | 2 | 003 | 23,71 | 0,00 | 3 | 003 | 1,32 | -4,00 | 4 | 004 | 8,42 | -2,58 | 5 | 004 | 5,46 | -4,00 | 6 | 003 | 5,68 | -4,00 | 7 | 003 | 0,65 | -0,03 | 8 | 004 | -3,91 | -3,91 | 9 | 004 | -6,73 | -8,00 | 10 | 004 | -0,70 | -0,72 | 11 | 005 | 5,58 | -8,00 | 12 | 004 | -4,58 | -4,58| | 1 | 003 | 6,25 | 0,00 | 2 | 004 | -5,02 | -5,02 | 3 | 006 | -5,62 | -8,00 | 4 | 004 | -5,76 | -5,76 | 5 | 004 | -2,63 | -4,80 | 6 | 004 | -0,31 | -0,31 | 7 | 004 | 13,94 | 0,00 | 8 | 005 | 25,43 | 0,00 | 9 | 005 | 25,00 | -8,00 | 10 | 008 | -7,87 | -7,87 | 11 | 003 | 8,43 | -4,00 | 12 | 004 | 4,85 | 0,00| | 1 | 005 | -4,72 | -4,72 | 2 | 002 | 8,31 | 0,00 | 3 | 004 | 2,47 | -0,97 | 4 | 003 | -1,95 | -4,30 | 5 | 004 | 22,27 | 0,00 | 6 | 004 | 10,03 | -8,00 | 7 | 004 | 12,46 | 0,00 | 8 | 005 | -6,93 | -8,00 | 9 | 003 | 1,67 | -0,87 | 10 | 003 | 12,34 | 0,00 | 11 | 003 | -0,08 | -0,08 | 12 | 004 | -4,28 | -4,28| | 1 | 003 | 7,70 | 0,00 | 2 | 003 | 1,43 | -2,82 | 3 | 003 | 7,85 | 0,00 | 4 | 005 | -6,83 | -6,83 | 5 | 004 | 17,31 | 0,00 | 6 | 001 | -4,00 | -4,00
//    |NVTK|Min Williams A/D | 9|7|1|op:buy  p:11,00 s: 4,00|NVTK|Max Williams A/D | 6|7|3|op:sell p:11,00 s: 4,00|RTKM|2 дня роста, 6 дня в op:sell p:11,00 s: 4,00|RTKM|2 дня падения, 2 дня в op:buy  p:11,00 s: 4,00| | 2010|025|020|  49,52|0,00| -8,00|2011|029|025|  56,67|-14,96| -8,00|2012|025|019|  51,60|-4,72| -8,00|2013|010|009|  23,47|0,00| -6,83 |  | 1 | 004 | 14,62 | 0,00 | 2 | 003 | 23,71 | 0,00 | 3 | 003 | 1,32 | -4,00 | 4 | 004 | 8,42 | -2,58 | 5 | 004 | 5,46 | -4,00 | 6 | 003 | 5,68 | -4,00 | 7 | 003 | 0,65 | -0,03 | 8 | 004 | -3,91 | -3,91 | 9 | 004 | -6,73 | -8,00 | 10 | 004 | -0,70 | -0,72 | 11 | 005 | 5,58 | -8,00 | 12 | 004 | -4,58 | -4,58| | 1 | 003 | 6,25 | 0,00 | 2 | 004 | -5,02 | -5,02 | 3 | 006 | -5,62 | -8,00 | 4 | 004 | -5,76 | -5,76 | 5 | 004 | -2,63 | -4,80 | 6 | 004 | -0,31 | -0,31 | 7 | 004 | 13,94 | 0,00 | 8 | 005 | 25,43 | 0,00 | 9 | 005 | 25,00 | -8,00 | 10 | 008 | -7,87 | -7,87 | 11 | 003 | 8,43 | -4,00 | 12 | 004 | 4,85 | 0,00| | 1 | 005 | -4,72 | -4,72 | 2 | 002 | 8,31 | 0,00 | 3 | 004 | 2,47 | -0,97 | 4 | 003 | -1,95 | -4,30 | 5 | 004 | 22,27 | 0,00 | 6 | 004 | 10,03 | -8,00 | 7 | 004 | 12,46 | 0,00 | 8 | 005 | -6,93 | -8,00 | 9 | 003 | 1,67 | -0,87 | 10 | 003 | 12,34 | 0,00 | 11 | 003 | -0,08 | -0,08 | 12 | 004 | -4,28 | -4,28| | 1 | 003 | 7,70 | 0,00 | 2 | 003 | 1,43 | -2,82 | 3 | 003 | 7,85 | 0,00 | 4 | 005 | -6,83 | -6,83 | 5 | 004 | 17,31 | 0,00 | 6 | 001 | -4,00 | -4,00
//    |NVTK|Min Williams A/D | 9|7|1|op:buy  p:11,00 s: 4,00|NVTK|Max Williams A/D | 6|7|3|op:sell p:11,00 s: 4,00|RTKM|2 дня падения, 2 дня в op:buy  p:11,00 s: 4,00|RTKM|2 дня роста, 6 дня в op:sell p:11,00 s: 4,00| | 2010|025|020|  49,52|0,00| -8,00|2011|029|025|  56,67|-14,96| -8,00|2012|025|019|  51,60|-4,72| -8,00|2013|010|009|  23,47|0,00| -6,83 |  | 1 | 004 | 14,62 | 0,00 | 2 | 003 | 23,71 | 0,00 | 3 | 003 | 1,32 | -4,00 | 4 | 004 | 8,42 | -2,58 | 5 | 004 | 5,46 | -4,00 | 6 | 003 | 5,68 | -4,00 | 7 | 003 | 0,65 | -0,03 | 8 | 004 | -3,91 | -3,91 | 9 | 004 | -6,73 | -8,00 | 10 | 004 | -0,70 | -0,72 | 11 | 005 | 5,58 | -8,00 | 12 | 004 | -4,58 | -4,58| | 1 | 003 | 6,25 | 0,00 | 2 | 004 | -5,02 | -5,02 | 3 | 006 | -5,62 | -8,00 | 4 | 004 | -5,76 | -5,76 | 5 | 004 | -2,63 | -4,80 | 6 | 004 | -0,31 | -0,31 | 7 | 004 | 13,94 | 0,00 | 8 | 005 | 25,43 | 0,00 | 9 | 005 | 25,00 | -8,00 | 10 | 008 | -7,87 | -7,87 | 11 | 003 | 8,43 | -4,00 | 12 | 004 | 4,85 | 0,00| | 1 | 005 | -4,72 | -4,72 | 2 | 002 | 8,31 | 0,00 | 3 | 004 | 2,47 | -0,97 | 4 | 003 | -1,95 | -4,30 | 5 | 004 | 22,27 | 0,00 | 6 | 004 | 10,03 | -8,00 | 7 | 004 | 12,46 | 0,00 | 8 | 005 | -6,93 | -8,00 | 9 | 003 | 1,67 | -0,87 | 10 | 003 | 12,34 | 0,00 | 11 | 003 | -0,08 | -0,08 | 12 | 004 | -4,28 | -4,28| | 1 | 003 | 7,70 | 0,00 | 2 | 003 | 1,43 | -2,82 | 3 | 003 | 7,85 | 0,00 | 4 | 005 | -6,83 | -6,83 | 5 | 004 | 17,31 | 0,00 | 6 | 001 | -4,00 | -4,00
//    |NVTK|Min Williams A/D | 9|7|1|op:buy  p:11,00 s: 4,00|RTKM|2 дня роста, 6 дня в op:sell p:11,00 s: 4,00|NVTK|Max Williams A/D | 6|7|3|op:sell p:11,00 s: 4,00|RTKM|2 дня падения, 2 дня в op:buy  p:11,00 s: 4,00| | 2010|026|023|  47,40|0,00|-11,77|2011|027|027|  47,75|-17,05| -9,89|2012|025|019|  51,60|-4,72| -8,00|2013|010|009|  23,61|0,00| -6,83 |  | 1 | 004 | 14,62 | 0,00 | 2 | 003 | 23,71 | 0,00 | 3 | 004 | -3,77 | -8,22 | 4 | 005 | 12,02 | 0,00 | 5 | 004 | 5,46 | -4,00 | 6 | 003 | 5,68 | -4,00 | 7 | 003 | 0,65 | -0,03 | 8 | 005 | -4,83 | -4,83 | 9 | 005 | -10,89 | -11,77 | 10 | 004 | 3,75 | 0,00 | 11 | 005 | 5,58 | -8,00 | 12 | 004 | -4,58 | -4,58| | 1 | 004 | -0,25 | -8,00 | 2 | 004 | -5,02 | -5,02 | 3 | 005 | 2,90 | -4,00 | 4 | 004 | -9,89 | -9,89 | 5 | 004 | -2,63 | -4,80 | 6 | 004 | -0,31 | -0,31 | 7 | 004 | 13,94 | 0,00 | 8 | 005 | 25,43 | 0,00 | 9 | 005 | 25,00 | -8,00 | 10 | 008 | -7,87 | -7,87 | 11 | 003 | 8,43 | -4,00 | 12 | 004 | -1,99 | -1,99| | 1 | 005 | -4,72 | -4,72 | 2 | 002 | 8,31 | 0,00 | 3 | 004 | 2,47 | -0,97 | 4 | 003 | -1,95 | -4,30 | 5 | 004 | 22,27 | 0,00 | 6 | 004 | 10,03 | -8,00 | 7 | 004 | 12,46 | 0,00 | 8 | 005 | -6,93 | -8,00 | 9 | 003 | 1,67 | -0,87 | 10 | 003 | 12,34 | 0,00 | 11 | 003 | -0,08 | -0,08 | 12 | 004 | -4,28 | -4,28| | 1 | 003 | 7,84 | 0,00 | 2 | 003 | 1,43 | -2,82 | 3 | 003 | 7,85 | 0,00 | 4 | 005 | -6,83 | -6,83 | 5 | 004 | 17,31 | 0,00 | 6 | 001 | -4,00 | -4,00
//    |NVTK|Min Williams A/D | 6|7|1|op:buy  p: 9,00 s: 4,00|RTKM|2 дня роста, 6 дня в op:sell p: 9,00 s: 4,00|NVTK|Max Williams A/D | 6|5|2|op:sell p: 9,00 s: 4,00|RTKM|2 дня падения, 2 дня в op:buy  p: 9,00 s: 4,00| | 2010|035|023|  87,24|0,00|-10,93|2011|029|026|  64,67|-26,28|-12,00|2012|030|019|  61,71|-6,62| -9,51|2013|012|007|  23,09|0,00| -9,03 |  | 1 | 004 | 14,62 | 0,00 | 2 | 004 | 33,94 | 0,00 | 3 | 004 | 4,78 | -5,07 | 4 | 006 | 17,90 | -0,07 | 5 | 008 | 25,52 | -8,00 | 6 | 004 | 2,51 | -8,00 | 7 | 004 | 7,06 | 0,00 | 8 | 005 | -7,23 | -7,23 | 9 | 006 | -4,83 | -10,93 | 10 | 003 | 1,37 | 0,00 | 11 | 005 | -0,57 | -8,00 | 12 | 005 | -7,84 | -8,00| | 1 | 004 | -0,25 | -8,00 | 2 | 005 | -9,02 | -9,02 | 3 | 005 | -4,47 | -5,77 | 4 | 004 | -5,76 | -5,76 | 5 | 004 | 2,57 | -4,80 | 6 | 004 | -5,35 | -5,35 | 7 | 004 | 11,21 | -4,00 | 8 | 007 | 44,23 | 0,00 | 9 | 005 | 20,76 | -6,24 | 10 | 004 | 13,30 | 0,00 | 11 | 004 | 8,57 | -1,41 | 12 | 005 | -11,12 | -12,00| | 1 | 006 | -6,62 | -6,62 | 2 | 003 | 8,22 | 0,00 | 3 | 004 | 2,47 | -0,97 | 4 | 002 | 4,03 | 0,00 | 5 | 005 | 24,68 | 0,00 | 6 | 005 | 8,09 | -6,52 | 7 | 005 | 21,55 | 0,00 | 8 | 005 | -6,93 | -8,00 | 9 | 003 | 1,67 | -0,87 | 10 | 004 | 3,18 | 0,00 | 11 | 004 | 10,86 | 0,00 | 12 | 003 | -9,51 | -9,51| | 1 | 003 | 8,83 | 0,00 | 2 | 003 | 1,43 | -2,82 | 3 | 004 | 7,30 | 0,00 | 4 | 005 | -6,76 | -9,03 | 5 | 004 | 12,29 | 0,00
    test("rtkm VS nvtk"){ checkCombination(williams.nvtkBestStrategies, DayStandardImporter.nvtk, 47) }
//    |RTKM|3 дня роста, 5 дня в op:sell p:11,00 s: 5,00|ROSN|Max Williams A/D | 3|6|1|op:sell p:11,00 s: 5,00|ROSN|Min Williams A/D | 3|3|3|op:buy  p:11,00 s: 5,00|RTKM|2 дня падения, 4 дня в op:buy  p:11,00 s: 5,00| | 2010|031|023|  64,52|0,00|-15,17|2011|033|027|  67,56|-7,01|-28,67|2012|031|018|  54,99|-2,47| -6,42|2013|015|009|  30,99|-3,57| -7,47 |  | 1 | 004 | 17,98 | 0,00 | 2 | 005 | 6,37 | 0,00 | 3 | 004 | 6,93 | 0,00 | 4 | 005 | -15,17 | -15,17 | 5 | 005 | 21,75 | -5,00 | 6 | 004 | 7,66 | 0,00 | 7 | 005 | 9,81 | -0,81 | 8 | 005 | 3,48 | 0,00 | 9 | 006 | -14,95 | -14,95 | 10 | 003 | 3,13 | -0,24 | 11 | 004 | 3,32 | -2,02 | 12 | 004 | 14,22 | 0,00| | 1 | 004 | -2,21 | -5,00 | 2 | 004 | -2,06 | -4,80 | 3 | 004 | 5,93 | 0,00 | 4 | 004 | 8,23 | 0,00 | 5 | 006 | 10,24 | -5,00 | 6 | 006 | -5,01 | -5,85 | 7 | 003 | 7,98 | 0,00 | 8 | 010 | -13,94 | -28,67 | 9 | 006 | 35,01 | 0,00 | 10 | 005 | 14,12 | 0,00 | 11 | 004 | 5,39 | 0,00 | 12 | 004 | 3,88 | 0,00| | 1 | 004 | 3,02 | -2,47 | 2 | 003 | 4,12 | 0,00 | 3 | 005 | 6,06 | -1,81 | 4 | 004 | 3,93 | 0,00 | 5 | 006 | 24,77 | 0,00 | 6 | 003 | -6,42 | -6,42 | 7 | 005 | 15,66 | -0,58 | 8 | 004 | -1,22 | -5,00 | 9 | 004 | -2,65 | -4,13 | 10 | 004 | 0,55 | -0,67 | 11 | 003 | 8,70 | -1,17 | 12 | 004 | -1,53 | -1,53| | 1 | 004 | -2,00 | -2,00 | 2 | 004 | 10,79 | -1,57 | 3 | 004 | 9,43 | 0,00 | 4 | 005 | 6,00 | 0,00 | 5 | 005 | 14,24 | -2,38 | 6 | 002 | -7,47 | -7,47
    test("rtkm VS rosn"){ checkCombination(williams.rosnBestStrategies, DayStandardImporter.rosn, 54) }
//    |SBER|Max Williams A/D | 3|3|2|op:sell p: 9,00 s: 4,00|RTKM|4 дня роста, 3 дня в op:sell p: 9,00 s: 4,00|SBER|Min Williams A/D | 3|7|2|op:buy  p: 9,00 s: 4,00|RTKM|2 дня падения, 4 дня в op:buy  p: 9,00 s: 4,00| | 2010|033|028|  65,43|0,00| -8,95|2011|035|027|  70,61|-0,89|-13,55|2012|036|018|  73,92|0,00| -9,26|2013|014|006|  32,32|-0,45| -3,61 |  | 1 | 004 | 13,76 | 0,00 | 2 | 004 | 7,06 | -1,94 | 3 | 005 | 0,10 | -5,94 | 4 | 006 | -5,10 | -5,10 | 5 | 009 | 6,06 | -4,00 | 6 | 006 | 4,95 | 0,00 | 7 | 004 | 20,30 | 0,00 | 8 | 005 | -1,72 | -8,95 | 9 | 006 | 7,72 | -4,43 | 10 | 005 | 8,10 | 0,00 | 11 | 003 | 8,32 | 0,00 | 12 | 004 | -4,12 | -4,12| | 1 | 003 | 3,11 | 0,00 | 2 | 004 | 4,06 | -4,00 | 3 | 003 | 14,49 | 0,00 | 4 | 005 | -9,45 | -9,45 | 5 | 005 | 18,97 | 0,00 | 6 | 005 | 5,35 | 0,00 | 7 | 005 | -0,58 | -4,00 | 8 | 008 | 8,32 | -7,72 | 9 | 006 | -13,55 | -13,55 | 10 | 007 | 16,07 | -4,00 | 11 | 006 | 15,00 | 0,00 | 12 | 005 | 8,81 | 0,00| | 1 | 004 | 10,02 | 0,00 | 2 | 004 | 7,51 | 0,00 | 3 | 006 | -8,19 | -9,26 | 4 | 004 | -0,95 | -0,95 | 5 | 005 | 9,91 | -1,85 | 6 | 004 | 13,61 | 0,00 | 7 | 005 | 24,15 | 0,00 | 8 | 005 | 6,24 | 0,00 | 9 | 003 | 3,66 | 0,00 | 10 | 005 | -3,76 | -3,76 | 11 | 004 | 5,19 | -1,63 | 12 | 005 | 6,54 | -4,70| | 1 | 003 | 4,79 | -0,45 | 2 | 004 | 1,89 | -0,49 | 3 | 003 | 0,24 | -2,74 | 4 | 004 | 11,39 | -3,61 | 5 | 005 | 10,11 | 0,00 | 6 | 001 | 3,90 | 0,00
    test("rtkm VS sber"){ checkCombination(williams.sberBestStrategies, DayStandardImporter.sber, 64) }

    override val trendData = DayStandardImporter.rtkm
    override val trendStrategies = new SimpleTrendSuccessfulStrategies{}.rtkmBestStrategies
}