package ideas.combination.williamsvswilliams

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import tradinganalyzers.statistics.{StrategyIdeaData, DayStandardImporter, StrategyElement, StrategiesCombinator}
import tradingideas.{WilliamsAdMin, WilliamsAdMax}
import tradinganalyzers.TradingOp._
import tradingsystems.TradingData

/**
 * @author alespuh
 * @since 30.07.13
 */
@RunWith(classOf[JUnitRunner])
class WilliamsAdSberVsAllCombination_Test extends FunSuite with WilliamsAdSuccessfulStrategies
{
//    |SBER|Min Williams A/D | 3|7|2|op:buy  p:11,00 s: 4,00|GAZP|Max Williams A/D |15|4|2|op:sell p:11,00 s: 4,00|SBER|Max Williams A/D | 3|3|2|op:sell p:11,00 s: 4,00|GAZP|Min Williams A/D | 3|5|1|op:buy  p:11,00 s: 4,00| | 2010|033|022|  77,03|-4,00|-10,39|2011|036|020|  72,35|-4,99| -8,00|2012|030|020|  65,19|0,00| -6,73|2013|014|009|  31,39|-0,25| -2,48 |  | 1 | 003 | 4,76 | -4,00 | 2 | 004 | 29,74 | 0,00 | 3 | 004 | 6,98 | 0,00 | 4 | 004 | -7,28 | -7,28 | 5 | 008 | 8,31 | -4,00 | 6 | 005 | -1,45 | -1,45 | 7 | 004 | 18,92 | 0,00 | 8 | 004 | -3,17 | -10,39 | 9 | 006 | 11,38 | -3,07 | 10 | 005 | 2,01 | -1,00 | 11 | 004 | 1,84 | -4,00 | 12 | 004 | 4,98 | 0,00| | 1 | 002 | 3,38 | 0,00 | 2 | 005 | -4,37 | -8,00 | 3 | 003 | 9,29 | -4,00 | 4 | 005 | 5,51 | -3,61 | 5 | 004 | 3,44 | -1,65 | 6 | 004 | 5,59 | -0,19 | 7 | 005 | -0,58 | -4,00 | 8 | 008 | 14,56 | -7,72 | 9 | 003 | 1,81 | -3,30 | 10 | 007 | 20,01 | 0,00 | 11 | 004 | 8,90 | 0,00 | 12 | 006 | 4,81 | 0,00| | 1 | 004 | 13,86 | 0,00 | 2 | 004 | 3,57 | -2,44 | 3 | 006 | -5,65 | -6,73 | 4 | 003 | 1,44 | 0,00 | 5 | 005 | -4,30 | -4,30 | 6 | 004 | 16,68 | 0,00 | 7 | 005 | 13,62 | 0,00 | 8 | 004 | 4,77 | 0,00 | 9 | 003 | 3,66 | 0,00 | 10 | 004 | 0,31 | 0,00 | 11 | 005 | 11,17 | 0,00 | 12 | 003 | 6,08 | -1,67| | 1 | 003 | 5,01 | -0,25 | 2 | 005 | 0,21 | -2,19 | 3 | 005 | 6,95 | -0,68 | 4 | 004 | 5,21 | -2,48 | 5 | 005 | 10,11 | 0,00 | 6 | 001 | 3,90 | 0,00
//    |SBER|Min Williams A/D | 3|7|2|op:buy  p:12,00 s: 4,00|GAZP|Max Williams A/D |15|4|2|op:sell p:12,00 s: 4,00|SBER|Max Williams A/D | 3|3|2|op:sell p:12,00 s: 4,00|GAZP|Min Williams A/D | 3|5|1|op:buy  p:12,00 s: 4,00| | 2010|033|020|  74,17|-4,00|-10,39|2011|036|019|  78,35|-4,99| -8,00|2012|030|020|  65,19|0,00| -6,73|2013|014|009|  31,39|-0,25| -2,48 |  | 1 | 003 | 4,76 | -4,00 | 2 | 004 | 29,74 | 0,00 | 3 | 004 | 6,98 | 0,00 | 4 | 004 | -7,28 | -7,28 | 5 | 007 | 8,62 | -4,00 | 6 | 005 | -1,45 | -1,45 | 7 | 004 | 18,92 | 0,00 | 8 | 004 | -3,17 | -10,39 | 9 | 006 | 8,52 | -3,07 | 10 | 004 | 1,71 | 0,00 | 11 | 004 | 1,84 | -4,00 | 12 | 004 | 4,98 | 0,00| | 1 | 002 | 3,38 | 0,00 | 2 | 005 | -4,37 | -8,00 | 3 | 003 | 9,29 | -4,00 | 4 | 005 | 5,51 | -3,61 | 5 | 004 | 3,44 | -1,65 | 6 | 004 | 5,59 | -0,19 | 7 | 005 | -0,58 | -4,00 | 8 | 008 | 15,56 | -7,72 | 9 | 003 | 1,81 | -3,30 | 10 | 006 | 25,01 | 0,00 | 11 | 004 | 8,90 | 0,00 | 12 | 006 | 4,81 | 0,00| | 1 | 004 | 13,86 | 0,00 | 2 | 004 | 3,57 | -2,44 | 3 | 006 | -5,65 | -6,73 | 4 | 003 | 1,44 | 0,00 | 5 | 005 | -4,30 | -4,30 | 6 | 004 | 16,68 | 0,00 | 7 | 005 | 13,62 | 0,00 | 8 | 004 | 4,77 | 0,00 | 9 | 003 | 3,66 | 0,00 | 10 | 004 | 0,31 | 0,00 | 11 | 005 | 11,17 | 0,00 | 12 | 003 | 6,08 | -1,67| | 1 | 003 | 5,01 | -0,25 | 2 | 005 | 0,21 | -2,19 | 3 | 005 | 6,95 | -0,68 | 4 | 004 | 5,21 | -2,48 | 5 | 005 | 10,11 | 0,00 | 6 | 001 | 3,90 | 0,00
//    |SBER|Min Williams A/D | 3|7|2|op:buy  p:13,00 s: 4,00|GAZP|Max Williams A/D |15|4|2|op:sell p:13,00 s: 4,00|SBER|Max Williams A/D | 3|3|2|op:sell p:13,00 s: 4,00|GAZP|Min Williams A/D | 3|5|1|op:buy  p:13,00 s: 4,00| | 2010|033|020|  75,17|-4,00|-10,39|2011|036|019|  76,46|-4,99| -8,00|2012|030|020|  65,19|0,00| -6,73|2013|014|009|  31,39|-0,25| -2,48 |  | 1 | 003 | 4,76 | -4,00 | 2 | 004 | 29,74 | 0,00 | 3 | 004 | 6,98 | 0,00 | 4 | 004 | -7,28 | -7,28 | 5 | 007 | 9,62 | -4,00 | 6 | 005 | -1,45 | -1,45 | 7 | 004 | 18,92 | 0,00 | 8 | 004 | -3,17 | -10,39 | 9 | 006 | 8,52 | -3,07 | 10 | 004 | 1,71 | 0,00 | 11 | 004 | 1,84 | -4,00 | 12 | 004 | 4,98 | 0,00| | 1 | 002 | 3,38 | 0,00 | 2 | 005 | -4,37 | -8,00 | 3 | 003 | 9,29 | -4,00 | 4 | 005 | 5,51 | -3,61 | 5 | 004 | 3,44 | -1,65 | 6 | 004 | 5,59 | -0,19 | 7 | 005 | -0,58 | -4,00 | 8 | 008 | 12,68 | -7,72 | 9 | 003 | 1,81 | -3,30 | 10 | 006 | 26,01 | 0,00 | 11 | 004 | 8,90 | 0,00 | 12 | 006 | 4,81 | 0,00| | 1 | 004 | 13,86 | 0,00 | 2 | 004 | 3,57 | -2,44 | 3 | 006 | -5,65 | -6,73 | 4 | 003 | 1,44 | 0,00 | 5 | 005 | -4,30 | -4,30 | 6 | 004 | 16,68 | 0,00 | 7 | 005 | 13,62 | 0,00 | 8 | 004 | 4,77 | 0,00 | 9 | 003 | 3,66 | 0,00 | 10 | 004 | 0,31 | 0,00 | 11 | 005 | 11,17 | 0,00 | 12 | 003 | 6,08 | -1,67| | 1 | 003 | 5,01 | -0,25 | 2 | 005 | 0,21 | -2,19 | 3 | 005 | 6,95 | -0,68 | 4 | 004 | 5,21 | -2,48 | 5 | 005 | 10,11 | 0,00 | 6 | 001 | 3,90 | 0,00
    test("sber VS gazp"){ checkCombination(gazpBestStrategies, DayStandardImporter.gazp, 60) }
//    |SBER|Min Williams A/D | 3|7|2|op:buy  p:10,00 s: 4,00|GMKN|Max Williams A/D | 3|4|3|op:sell p:10,00 s: 4,00|SBER|Max Williams A/D | 3|3|2|op:sell p:10,00 s: 4,00|GMKN|Min Williams A/D | 6|5|2|op:buy  p:10,00 s: 4,00| | 2010|031|024|  53,69|-12,12|-15,46|2011|034|025|  56,31|-4,99| -8,00|2012|033|016|  63,24|0,00| -9,26|2013|013|007|  28,44|-0,10| -3,61 |  | 1 | 003 | 4,76 | -4,00 | 2 | 004 | 13,93 | -3,40 | 3 | 004 | -11,36 | -11,36 | 4 | 005 | -15,46 | -15,46 | 5 | 006 | 24,60 | -4,00 | 6 | 005 | 4,58 | -4,00 | 7 | 005 | 16,76 | -4,00 | 8 | 004 | 0,35 | -6,87 | 9 | 006 | 8,72 | -4,43 | 10 | 005 | -1,38 | -6,48 | 11 | 004 | 3,20 | 0,00 | 12 | 004 | 4,98 | 0,00| | 1 | 002 | 3,38 | 0,00 | 2 | 005 | -4,37 | -8,00 | 3 | 004 | 1,16 | -4,00 | 4 | 005 | -0,35 | -0,35 | 5 | 003 | 5,82 | 0,00 | 6 | 006 | 3,45 | 0,00 | 7 | 004 | 3,42 | 0,00 | 8 | 007 | 15,67 | -0,55 | 9 | 005 | 10,22 | 0,00 | 10 | 006 | 10,55 | -4,97 | 11 | 006 | -1,88 | -1,88 | 12 | 006 | 9,25 | 0,00| | 1 | 004 | 10,68 | 0,00 | 2 | 004 | 7,51 | 0,00 | 3 | 006 | -8,19 | -9,26 | 4 | 004 | -1,34 | -1,34 | 5 | 003 | 9,38 | -2,38 | 6 | 004 | 13,52 | 0,00 | 7 | 005 | 10,22 | 0,00 | 8 | 004 | 2,45 | 0,00 | 9 | 003 | 3,66 | 0,00 | 10 | 005 | 1,71 | 0,00 | 11 | 004 | 4,85 | -1,78 | 12 | 003 | 8,81 | 0,00| | 1 | 003 | 5,14 | -0,10 | 2 | 004 | 1,89 | -0,49 | 3 | 003 | 3,31 | 0,00 | 4 | 004 | 4,09 | -3,61 | 5 | 005 | 10,11 | 0,00 | 6 | 001 | 3,90 | 0,00
//    |SBER|Min Williams A/D | 3|7|2|op:buy  p: 9,00 s: 4,00|GMKN|Max Williams A/D | 3|4|3|op:sell p: 9,00 s: 4,00|SBER|Max Williams A/D | 3|3|2|op:sell p: 9,00 s: 4,00|GMKN|Min Williams A/D | 6|5|2|op:buy  p: 9,00 s: 4,00| | 2010|033|024|  64,31|-4,00| -9,84|2011|035|027|  62,93|-4,99| -8,00|2012|032|017|  64,66|0,00| -9,26|2013|013|007|  28,44|-0,10| -3,61 |  | 1 | 003 | 4,76 | -4,00 | 2 | 004 | 12,93 | -3,40 | 3 | 006 | -6,79 | -9,84 | 4 | 005 | -8,73 | -8,73 | 5 | 006 | 24,53 | -4,00 | 6 | 005 | 4,58 | -4,00 | 7 | 005 | 18,14 | -4,00 | 8 | 004 | 0,35 | -6,87 | 9 | 006 | 7,72 | -4,43 | 10 | 005 | -1,38 | -6,48 | 11 | 004 | 3,20 | 0,00 | 12 | 004 | 4,98 | 0,00| | 1 | 002 | 3,38 | 0,00 | 2 | 005 | -4,37 | -8,00 | 3 | 004 | 0,16 | -4,00 | 4 | 005 | -0,35 | -0,35 | 5 | 003 | 5,82 | 0,00 | 6 | 006 | 3,45 | 0,00 | 7 | 004 | 3,42 | 0,00 | 8 | 007 | 15,03 | -0,18 | 9 | 005 | 10,70 | 0,00 | 10 | 008 | 12,07 | 0,00 | 11 | 007 | 4,38 | -4,00 | 12 | 006 | 9,25 | 0,00| | 1 | 005 | 17,22 | 0,00 | 2 | 003 | 3,38 | -1,03 | 3 | 006 | -8,19 | -9,26 | 4 | 004 | -1,34 | -1,34 | 5 | 003 | 9,38 | -2,38 | 6 | 004 | 12,52 | 0,00 | 7 | 005 | 10,22 | 0,00 | 8 | 004 | 2,45 | 0,00 | 9 | 003 | 3,66 | 0,00 | 10 | 005 | 1,71 | 0,00 | 11 | 004 | 4,85 | -1,78 | 12 | 003 | 8,81 | 0,00| | 1 | 003 | 5,14 | -0,10 | 2 | 004 | 1,89 | -0,49 | 3 | 003 | 3,31 | 0,00 | 4 | 004 | 4,09 | -3,61 | 5 | 005 | 10,11 | 0,00 | 6 | 001 | 3,90 | 0,00
    test("sber VS gmkn"){ checkCombination(gmknBestStrategies, DayStandardImporter.gmkn, 50) }
    //ниже 50ти процентов
    test("sber VS lkoh"){ checkCombination(lkohBestStrategies, DayStandardImporter.lkoh, 50) }
//    |SBER|Max Williams A/D | 6|3|2|op:sell p: 9,00 s: 4,00|NVTK|Min Williams A/D | 6|6|3|op:buy  p: 9,00 s: 4,00|NVTK|Max Williams A/D | 6|6|1|op:sell p: 9,00 s: 4,00|SBER|Min Williams A/D | 6|4|1|op:buy  p: 9,00 s: 4,00| | 2010|036|021|  75,89|0,00|-21,35|2011|034|028|  61,02|-9,69| -9,35|2012|033|023|  67,61|-11,95|-12,68|2013|014|009|  29,67|0,00| -6,66 |  | 1 | 002 | 10,43 | 0,00 | 2 | 003 | 13,72 | -4,00 | 3 | 005 | 8,45 | 0,00 | 4 | 005 | 20,64 | 0,00 | 5 | 005 | 14,26 | -4,00 | 6 | 008 | -21,35 | -21,35 | 7 | 004 | 16,38 | 0,00 | 8 | 005 | 2,58 | -4,52 | 9 | 007 | 1,63 | -4,43 | 10 | 004 | -4,04 | -4,04 | 11 | 005 | 0,29 | -4,00 | 12 | 004 | 12,90 | 0,00| | 1 | 003 | 8,59 | 0,00 | 2 | 005 | -8,37 | -8,37 | 3 | 006 | -5,18 | -9,35 | 4 | 005 | -0,73 | -2,82 | 5 | 004 | -1,70 | -4,00 | 6 | 005 | -0,85 | -0,85 | 7 | 004 | 9,57 | 0,00 | 8 | 007 | 27,99 | 0,00 | 9 | 006 | 10,02 | 0,00 | 10 | 006 | 7,32 | -8,00 | 11 | 005 | 2,66 | -8,00 | 12 | 006 | 11,70 | 0,00| | 1 | 005 | 2,89 | -0,46 | 2 | 006 | -12,68 | -12,68 | 3 | 005 | 0,21 | -2,16 | 4 | 003 | 3,65 | 0,00 | 5 | 006 | 11,58 | 0,00 | 6 | 005 | 13,44 | 0,00 | 7 | 005 | 30,54 | 0,00 | 8 | 004 | 8,34 | 0,00 | 9 | 004 | 0,40 | -0,09 | 10 | 005 | -1,68 | -2,31 | 11 | 005 | 4,61 | -4,00 | 12 | 003 | 6,30 | -1,03| | 1 | 003 | 4,75 | 0,00 | 2 | 005 | 8,03 | 0,00 | 3 | 003 | 5,81 | 0,00 | 4 | 005 | 12,12 | -0,19 | 5 | 005 | 5,62 | -2,33 | 6 | 002 | -6,66 | -6,66
//    |SBER|Max Williams A/D | 6|3|2|op:sell p:10,00 s: 4,00|NVTK|Min Williams A/D | 6|6|3|op:buy  p:10,00 s: 4,00|NVTK|Max Williams A/D | 6|6|1|op:sell p:10,00 s: 4,00|SBER|Min Williams A/D | 6|4|1|op:buy  p:10,00 s: 4,00| | 2010|036|021|  79,38|0,00|-21,35|2011|033|025|  67,20|-9,69| -9,35|2012|033|023|  67,11|-11,95|-12,68|2013|014|009|  29,67|0,00| -6,66 |  | 1 | 002 | 10,43 | 0,00 | 2 | 003 | 13,20 | -4,00 | 3 | 005 | 9,45 | 0,00 | 4 | 005 | 21,64 | 0,00 | 5 | 005 | 15,26 | -4,00 | 6 | 008 | -21,35 | -21,35 | 7 | 004 | 16,38 | 0,00 | 8 | 005 | 2,58 | -4,52 | 9 | 007 | 1,63 | -4,43 | 10 | 004 | -4,04 | -4,04 | 11 | 005 | 0,29 | -4,00 | 12 | 004 | 13,90 | 0,00| | 1 | 003 | 8,59 | 0,00 | 2 | 005 | -8,37 | -8,37 | 3 | 006 | -5,18 | -9,35 | 4 | 005 | -0,73 | -2,82 | 5 | 004 | -1,70 | -4,00 | 6 | 005 | -0,85 | -0,85 | 7 | 004 | 10,57 | 0,00 | 8 | 005 | 24,66 | 0,00 | 9 | 006 | 12,02 | 0,00 | 10 | 006 | 8,51 | -8,00 | 11 | 003 | 7,98 | -1,73 | 12 | 006 | 11,70 | 0,00| | 1 | 005 | 2,89 | -0,46 | 2 | 006 | -12,68 | -12,68 | 3 | 005 | 0,21 | -2,16 | 4 | 003 | 3,65 | 0,00 | 5 | 006 | 11,58 | 0,00 | 6 | 005 | 14,44 | 0,00 | 7 | 005 | 29,04 | 0,00 | 8 | 004 | 8,34 | 0,00 | 9 | 004 | 0,40 | -0,09 | 10 | 005 | -1,68 | -2,31 | 11 | 005 | 4,61 | -4,00 | 12 | 003 | 6,30 | -1,03| | 1 | 003 | 4,75 | 0,00 | 2 | 005 | 8,03 | 0,00 | 3 | 003 | 5,81 | 0,00 | 4 | 005 | 12,12 | -0,19 | 5 | 005 | 5,62 | -2,33 | 6 | 002 | -6,66 | -6,66
//    |SBER|Max Williams A/D | 6|3|2|op:sell p:11,00 s: 4,00|NVTK|Min Williams A/D | 6|6|3|op:buy  p:11,00 s: 4,00|NVTK|Max Williams A/D | 6|6|1|op:sell p:11,00 s: 4,00|SBER|Min Williams A/D | 6|4|1|op:buy  p:11,00 s: 4,00| | 2010|034|022|  60,83|0,00|-21,35|2011|033|023|  86,31|-9,69| -9,35|2012|033|023|  67,24|-11,95|-12,68|2013|014|009|  29,67|0,00| -6,66 |  | 1 | 002 | 10,43 | 0,00 | 2 | 003 | 13,20 | -4,00 | 3 | 005 | 10,45 | 0,00 | 4 | 005 | 4,86 | 0,00 | 5 | 004 | 11,49 | -4,00 | 6 | 008 | -21,35 | -21,35 | 7 | 004 | 16,38 | 0,00 | 8 | 005 | 2,58 | -4,52 | 9 | 007 | 1,63 | -4,43 | 10 | 004 | -4,04 | -4,04 | 11 | 005 | 0,29 | -4,00 | 12 | 004 | 14,90 | 0,00| | 1 | 003 | 8,59 | 0,00 | 2 | 005 | -8,37 | -8,37 | 3 | 006 | -5,18 | -9,35 | 4 | 005 | -0,73 | -2,82 | 5 | 004 | -1,70 | -4,00 | 6 | 005 | -0,85 | -0,85 | 7 | 004 | 11,57 | 0,00 | 8 | 005 | 23,53 | 0,00 | 9 | 005 | 26,26 | -6,74 | 10 | 005 | 13,51 | -4,00 | 11 | 003 | 7,98 | -1,73 | 12 | 006 | 11,70 | 0,00| | 1 | 005 | 2,89 | -0,46 | 2 | 006 | -12,68 | -12,68 | 3 | 005 | 0,21 | -2,16 | 4 | 003 | 3,65 | 0,00 | 5 | 006 | 11,58 | 0,00 | 6 | 005 | 14,57 | 0,00 | 7 | 005 | 29,04 | 0,00 | 8 | 004 | 8,34 | 0,00 | 9 | 004 | 0,40 | -0,09 | 10 | 005 | -1,68 | -2,31 | 11 | 005 | 4,61 | -4,00 | 12 | 003 | 6,30 | -1,03| | 1 | 003 | 4,75 | 0,00 | 2 | 005 | 8,03 | 0,00 | 3 | 003 | 5,81 | 0,00 | 4 | 005 | 12,12 | -0,19 | 5 | 005 | 5,62 | -2,33 | 6 | 002 | -6,66 | -6,66
//    |SBER|Max Williams A/D | 6|3|2|op:sell p:12,00 s: 4,00|NVTK|Min Williams A/D | 6|6|3|op:buy  p:12,00 s: 4,00|NVTK|Max Williams A/D | 6|6|1|op:sell p:12,00 s: 4,00|SBER|Min Williams A/D | 6|4|1|op:buy  p:12,00 s: 4,00| | 2010|034|022|  62,18|0,00|-21,35|2011|032|023|  71,70|-9,69| -9,35|2012|033|023|  67,24|-11,95|-12,68|2013|014|009|  29,67|0,00| -6,66 |  | 1 | 002 | 10,43 | 0,00 | 2 | 003 | 13,20 | -4,00 | 3 | 005 | 10,80 | 0,00 | 4 | 005 | 4,86 | 0,00 | 5 | 004 | 11,49 | -4,00 | 6 | 008 | -21,35 | -21,35 | 7 | 004 | 16,38 | 0,00 | 8 | 005 | 2,58 | -4,52 | 9 | 007 | 1,63 | -4,43 | 10 | 004 | -4,04 | -4,04 | 11 | 005 | 0,29 | -4,00 | 12 | 004 | 15,90 | 0,00| | 1 | 003 | 8,59 | 0,00 | 2 | 005 | -8,37 | -8,37 | 3 | 006 | -5,18 | -9,35 | 4 | 005 | -0,73 | -2,82 | 5 | 004 | -1,70 | -4,00 | 6 | 005 | -0,85 | -0,85 | 7 | 004 | 11,10 | 0,00 | 8 | 004 | 28,53 | 0,00 | 9 | 004 | 10,13 | -6,74 | 10 | 006 | 10,51 | -8,00 | 11 | 003 | 7,98 | -1,73 | 12 | 006 | 11,70 | 0,00| | 1 | 005 | 2,89 | -0,46 | 2 | 006 | -12,68 | -12,68 | 3 | 005 | 0,21 | -2,16 | 4 | 003 | 3,65 | 0,00 | 5 | 006 | 11,58 | 0,00 | 6 | 005 | 14,57 | 0,00 | 7 | 005 | 29,04 | 0,00 | 8 | 004 | 8,34 | 0,00 | 9 | 004 | 0,40 | -0,09 | 10 | 005 | -1,68 | -2,31 | 11 | 005 | 4,61 | -4,00 | 12 | 003 | 6,30 | -1,03| | 1 | 003 | 4,75 | 0,00 | 2 | 005 | 8,03 | 0,00 | 3 | 003 | 5,81 | 0,00 | 4 | 005 | 12,12 | -0,19 | 5 | 005 | 5,62 | -2,33 | 6 | 002 | -6,66 | -6,66
//    |SBER|Max Williams A/D | 6|3|2|op:sell p:13,00 s: 4,00|NVTK|Min Williams A/D | 6|6|3|op:buy  p:13,00 s: 4,00|NVTK|Max Williams A/D | 6|6|1|op:sell p:13,00 s: 4,00|SBER|Min Williams A/D | 6|4|1|op:buy  p:13,00 s: 4,00| | 2010|034|022|  63,18|0,00|-21,35|2011|032|023|  71,81|-9,69| -9,35|2012|033|023|  67,24|-11,95|-12,68|2013|014|009|  29,67|0,00| -6,66 |  | 1 | 002 | 10,43 | 0,00 | 2 | 003 | 13,20 | -4,00 | 3 | 005 | 10,80 | 0,00 | 4 | 005 | 4,86 | 0,00 | 5 | 004 | 11,49 | -4,00 | 6 | 008 | -21,35 | -21,35 | 7 | 004 | 16,38 | 0,00 | 8 | 005 | 2,58 | -4,52 | 9 | 007 | 1,63 | -4,43 | 10 | 004 | -4,04 | -4,04 | 11 | 005 | 0,29 | -4,00 | 12 | 004 | 16,90 | 0,00| | 1 | 003 | 8,59 | 0,00 | 2 | 005 | -8,37 | -8,37 | 3 | 006 | -5,18 | -9,35 | 4 | 005 | -0,73 | -2,82 | 5 | 004 | -1,70 | -4,00 | 6 | 005 | -0,85 | -0,85 | 7 | 004 | 11,10 | 0,00 | 8 | 004 | 29,53 | 0,00 | 9 | 004 | 11,13 | -6,74 | 10 | 006 | 8,62 | -8,00 | 11 | 003 | 7,98 | -1,73 | 12 | 006 | 11,70 | 0,00| | 1 | 005 | 2,89 | -0,46 | 2 | 006 | -12,68 | -12,68 | 3 | 005 | 0,21 | -2,16 | 4 | 003 | 3,65 | 0,00 | 5 | 006 | 11,58 | 0,00 | 6 | 005 | 14,57 | 0,00 | 7 | 005 | 29,04 | 0,00 | 8 | 004 | 8,34 | 0,00 | 9 | 004 | 0,40 | -0,09 | 10 | 005 | -1,68 | -2,31 | 11 | 005 | 4,61 | -4,00 | 12 | 003 | 6,30 | -1,03| | 1 | 003 | 4,75 | 0,00 | 2 | 005 | 8,03 | 0,00 | 3 | 003 | 5,81 | 0,00 | 4 | 005 | 12,12 | -0,19 | 5 | 005 | 5,62 | -2,33 | 6 | 002 | -6,66 | -6,66
//    |SBER|Max Williams A/D | 6|3|2|op:sell p: 8,00 s: 4,00|NVTK|Min Williams A/D | 6|6|3|op:buy  p: 8,00 s: 4,00|NVTK|Max Williams A/D | 6|6|1|op:sell p: 8,00 s: 4,00|SBER|Min Williams A/D | 6|4|1|op:buy  p: 8,00 s: 4,00| | 2010|037|023|  84,69|0,00|-21,35|2011|036|028|  62,97|-0,43| -9,35|2012|033|023|  59,43|-11,95|-12,68|2013|014|009|  29,95|0,00| -6,66 |  | 1 | 002 | 10,43 | 0,00 | 2 | 003 | 12,00 | -4,00 | 3 | 006 | 7,86 | 0,00 | 4 | 005 | 19,64 | 0,00 | 5 | 007 | 27,37 | -4,00 | 6 | 008 | -21,35 | -21,35 | 7 | 004 | 16,38 | 0,00 | 8 | 005 | 2,58 | -4,52 | 9 | 007 | 1,63 | -4,43 | 10 | 004 | -4,04 | -4,04 | 11 | 005 | 0,29 | -4,00 | 12 | 004 | 11,90 | 0,00| | 1 | 004 | 17,85 | 0,00 | 2 | 005 | -8,37 | -8,37 | 3 | 006 | -5,18 | -9,35 | 4 | 005 | -0,73 | -2,82 | 5 | 004 | -1,70 | -4,00 | 6 | 005 | -0,85 | -0,85 | 7 | 004 | 12,26 | 0,00 | 8 | 008 | 20,99 | 0,00 | 9 | 006 | 8,02 | 0,00 | 10 | 006 | 6,32 | -8,00 | 11 | 005 | 2,66 | -8,00 | 12 | 006 | 11,70 | 0,00| | 1 | 005 | 2,89 | -0,46 | 2 | 006 | -12,68 | -12,68 | 3 | 005 | 0,21 | -2,16 | 4 | 003 | 3,65 | 0,00 | 5 | 006 | 11,58 | 0,00 | 6 | 005 | 12,44 | 0,00 | 7 | 005 | 23,35 | 0,00 | 8 | 004 | 8,34 | 0,00 | 9 | 004 | 0,40 | -0,09 | 10 | 005 | -1,68 | -2,31 | 11 | 005 | 4,61 | -4,00 | 12 | 003 | 6,30 | -1,03| | 1 | 003 | 4,75 | 0,00 | 2 | 005 | 8,03 | 0,00 | 3 | 003 | 5,81 | 0,00 | 4 | 005 | 12,40 | -0,19 | 5 | 005 | 5,62 | -2,33 | 6 | 002 | -6,66 | -6,66
//    |NVTK|Max Williams A/D | 6|5|3|op:sell p:11,00 s: 3,00|NVTK|Min Williams A/D | 6|7|3|op:buy  p:11,00 s: 3,00|SBER|Max Williams A/D | 6|6|1|op:sell p:11,00 s: 3,00|SBER|Min Williams A/D | 6|6|2|op:buy  p:11,00 s: 3,00| | 2010|027|022|  75,80|0,00|-10,10|2011|029|025|  80,47|0,00| -7,00|2012|031|013|  58,15|-7,61| -4,16|2013|011|006|  30,52|0,00| -2,86 |  | 1 | 001 | 5,85 | 0,00 | 2 | 004 | 35,21 | 0,00 | 3 | 005 | -0,83 | -7,07 | 4 | 005 | -0,14 | -7,73 | 5 | 004 | 14,56 | -3,00 | 6 | 005 | 19,31 | 0,00 | 7 | 004 | -1,10 | -4,66 | 8 | 005 | -7,29 | -10,10 | 9 | 005 | -5,54 | -9,00 | 10 | 003 | 0,07 | -1,90 | 11 | 004 | 12,09 | -1,86 | 12 | 004 | 3,61 | -3,00| | 1 | 003 | 3,95 | 0,00 | 2 | 004 | 8,72 | 0,00 | 3 | 004 | -3,70 | -3,70 | 4 | 004 | -1,68 | -1,68 | 5 | 005 | 1,29 | -6,43 | 6 | 005 | 0,85 | -3,00 | 7 | 003 | 9,04 | 0,00 | 8 | 008 | 1,69 | -7,00 | 9 | 004 | 22,91 | 0,00 | 10 | 006 | 26,89 | -6,00 | 11 | 004 | 1,84 | 0,00 | 12 | 004 | 8,67 | -3,00| | 1 | 004 | -1,02 | -4,16 | 2 | 004 | -3,58 | -3,59 | 3 | 004 | -0,89 | -3,00 | 4 | 003 | 7,82 | 0,00 | 5 | 004 | 5,60 | 0,00 | 6 | 003 | 11,23 | -3,00 | 7 | 004 | 15,32 | 0,00 | 8 | 003 | 4,28 | 0,00 | 9 | 004 | 3,60 | 0,00 | 10 | 003 | 6,36 | 0,00 | 11 | 005 | 10,49 | -3,00 | 12 | 003 | -1,06 | -1,06| | 1 | 003 | 2,73 | 0,00 | 2 | 003 | -1,58 | -1,58 | 3 | 004 | 4,25 | 0,00 | 4 | 003 | -0,59 | -2,86 | 5 | 004 | 25,71 | -0,58
//    |NVTK|Max Williams A/D | 6|5|3|op:sell p:11,00 s: 3,00|NVTK|Min Williams A/D | 6|7|3|op:buy  p:11,00 s: 3,00|SBER|Min Williams A/D | 6|6|2|op:buy  p:11,00 s: 3,00|SBER|Max Williams A/D | 6|6|1|op:sell p:11,00 s: 3,00| | 2010|027|022|  75,80|0,00|-10,10|2011|029|025|  80,47|0,00| -7,00|2012|031|013|  58,15|-7,61| -4,16|2013|011|006|  30,52|0,00| -2,86 |  | 1 | 001 | 5,85 | 0,00 | 2 | 004 | 35,21 | 0,00 | 3 | 005 | -0,83 | -7,07 | 4 | 005 | -0,14 | -7,73 | 5 | 004 | 14,56 | -3,00 | 6 | 005 | 19,31 | 0,00 | 7 | 004 | -1,10 | -4,66 | 8 | 005 | -7,29 | -10,10 | 9 | 005 | -5,54 | -9,00 | 10 | 003 | 0,07 | -1,90 | 11 | 004 | 12,09 | -1,86 | 12 | 004 | 3,61 | -3,00| | 1 | 003 | 3,95 | 0,00 | 2 | 004 | 8,72 | 0,00 | 3 | 004 | -3,70 | -3,70 | 4 | 004 | -1,68 | -1,68 | 5 | 005 | 1,29 | -6,43 | 6 | 005 | 0,85 | -3,00 | 7 | 003 | 9,04 | 0,00 | 8 | 008 | 1,69 | -7,00 | 9 | 004 | 22,91 | 0,00 | 10 | 006 | 26,89 | -6,00 | 11 | 004 | 1,84 | 0,00 | 12 | 004 | 8,67 | -3,00| | 1 | 004 | -1,02 | -4,16 | 2 | 004 | -3,58 | -3,59 | 3 | 004 | -0,89 | -3,00 | 4 | 003 | 7,82 | 0,00 | 5 | 004 | 5,60 | 0,00 | 6 | 003 | 11,23 | -3,00 | 7 | 004 | 15,32 | 0,00 | 8 | 003 | 4,28 | 0,00 | 9 | 004 | 3,60 | 0,00 | 10 | 003 | 6,36 | 0,00 | 11 | 005 | 10,49 | -3,00 | 12 | 003 | -1,06 | -1,06| | 1 | 003 | 2,73 | 0,00 | 2 | 003 | -1,58 | -1,58 | 3 | 004 | 4,25 | 0,00 | 4 | 003 | -0,59 | -2,86 | 5 | 004 | 25,71 | -0,58
//    |NVTK|Min Williams A/D | 6|7|3|op:buy  p:11,00 s: 3,00|NVTK|Max Williams A/D | 6|5|3|op:sell p:11,00 s: 3,00|SBER|Max Williams A/D | 6|6|1|op:sell p:11,00 s: 3,00|SBER|Min Williams A/D | 6|6|2|op:buy  p:11,00 s: 3,00| | 2010|027|022|  75,80|0,00|-10,10|2011|029|025|  80,47|0,00| -7,00|2012|031|013|  58,15|-7,61| -4,16|2013|011|006|  30,52|0,00| -2,86 |  | 1 | 001 | 5,85 | 0,00 | 2 | 004 | 35,21 | 0,00 | 3 | 005 | -0,83 | -7,07 | 4 | 005 | -0,14 | -7,73 | 5 | 004 | 14,56 | -3,00 | 6 | 005 | 19,31 | 0,00 | 7 | 004 | -1,10 | -4,66 | 8 | 005 | -7,29 | -10,10 | 9 | 005 | -5,54 | -9,00 | 10 | 003 | 0,07 | -1,90 | 11 | 004 | 12,09 | -1,86 | 12 | 004 | 3,61 | -3,00| | 1 | 003 | 3,95 | 0,00 | 2 | 004 | 8,72 | 0,00 | 3 | 004 | -3,70 | -3,70 | 4 | 004 | -1,68 | -1,68 | 5 | 005 | 1,29 | -6,43 | 6 | 005 | 0,85 | -3,00 | 7 | 003 | 9,04 | 0,00 | 8 | 008 | 1,69 | -7,00 | 9 | 004 | 22,91 | 0,00 | 10 | 006 | 26,89 | -6,00 | 11 | 004 | 1,84 | 0,00 | 12 | 004 | 8,67 | -3,00| | 1 | 004 | -1,02 | -4,16 | 2 | 004 | -3,58 | -3,59 | 3 | 004 | -0,89 | -3,00 | 4 | 003 | 7,82 | 0,00 | 5 | 004 | 5,60 | 0,00 | 6 | 003 | 11,23 | -3,00 | 7 | 004 | 15,32 | 0,00 | 8 | 003 | 4,28 | 0,00 | 9 | 004 | 3,60 | 0,00 | 10 | 003 | 6,36 | 0,00 | 11 | 005 | 10,49 | -3,00 | 12 | 003 | -1,06 | -1,06| | 1 | 003 | 2,73 | 0,00 | 2 | 003 | -1,58 | -1,58 | 3 | 004 | 4,25 | 0,00 | 4 | 003 | -0,59 | -2,86 | 5 | 004 | 25,71 | -0,58
//    |NVTK|Min Williams A/D | 6|7|3|op:buy  p:11,00 s: 3,00|NVTK|Max Williams A/D | 6|5|3|op:sell p:11,00 s: 3,00|SBER|Min Williams A/D | 6|6|2|op:buy  p:11,00 s: 3,00|SBER|Max Williams A/D | 6|6|1|op:sell p:11,00 s: 3,00| | 2010|027|022|  75,80|0,00|-10,10|2011|029|025|  80,47|0,00| -7,00|2012|031|013|  58,15|-7,61| -4,16|2013|011|006|  30,52|0,00| -2,86 |  | 1 | 001 | 5,85 | 0,00 | 2 | 004 | 35,21 | 0,00 | 3 | 005 | -0,83 | -7,07 | 4 | 005 | -0,14 | -7,73 | 5 | 004 | 14,56 | -3,00 | 6 | 005 | 19,31 | 0,00 | 7 | 004 | -1,10 | -4,66 | 8 | 005 | -7,29 | -10,10 | 9 | 005 | -5,54 | -9,00 | 10 | 003 | 0,07 | -1,90 | 11 | 004 | 12,09 | -1,86 | 12 | 004 | 3,61 | -3,00| | 1 | 003 | 3,95 | 0,00 | 2 | 004 | 8,72 | 0,00 | 3 | 004 | -3,70 | -3,70 | 4 | 004 | -1,68 | -1,68 | 5 | 005 | 1,29 | -6,43 | 6 | 005 | 0,85 | -3,00 | 7 | 003 | 9,04 | 0,00 | 8 | 008 | 1,69 | -7,00 | 9 | 004 | 22,91 | 0,00 | 10 | 006 | 26,89 | -6,00 | 11 | 004 | 1,84 | 0,00 | 12 | 004 | 8,67 | -3,00| | 1 | 004 | -1,02 | -4,16 | 2 | 004 | -3,58 | -3,59 | 3 | 004 | -0,89 | -3,00 | 4 | 003 | 7,82 | 0,00 | 5 | 004 | 5,60 | 0,00 | 6 | 003 | 11,23 | -3,00 | 7 | 004 | 15,32 | 0,00 | 8 | 003 | 4,28 | 0,00 | 9 | 004 | 3,60 | 0,00 | 10 | 003 | 6,36 | 0,00 | 11 | 005 | 10,49 | -3,00 | 12 | 003 | -1,06 | -1,06| | 1 | 003 | 2,73 | 0,00 | 2 | 003 | -1,58 | -1,58 | 3 | 004 | 4,25 | 0,00 | 4 | 003 | -0,59 | -2,86 | 5 | 004 | 25,71 | -0,58
//    |NVTK|Max Williams A/D | 6|5|3|op:sell p: 9,00 s: 3,00|SBER|Max Williams A/D | 6|6|1|op:sell p: 9,00 s: 3,00|NVTK|Min Williams A/D | 6|7|3|op:buy  p: 9,00 s: 3,00|SBER|Min Williams A/D | 6|6|2|op:buy  p: 9,00 s: 3,00| | 2010|026|023|  59,17|0,00|-10,10|2011|031|030|  59,55|0,00|-15,00|2012|033|014|  63,38|-7,62| -6,59|2013|011|006|  29,47|0,00| -2,86 |  | 1 | 001 | 5,85 | 0,00 | 2 | 004 | 33,94 | 0,00 | 3 | 005 | -0,83 | -7,07 | 4 | 005 | 1,27 | -7,73 | 5 | 004 | 18,82 | -3,00 | 6 | 005 | 17,31 | 0,00 | 7 | 004 | -1,10 | -4,66 | 8 | 005 | -7,29 | -10,10 | 9 | 005 | -5,54 | -9,00 | 10 | 003 | 0,07 | -1,90 | 11 | 004 | 0,08 | -1,86 | 12 | 004 | -3,41 | -3,41| | 1 | 003 | 3,95 | 0,00 | 2 | 004 | 8,72 | 0,00 | 3 | 003 | 5,47 | 0,00 | 4 | 004 | -1,68 | -1,68 | 5 | 005 | -5,20 | -6,43 | 6 | 005 | -2,27 | -2,27 | 7 | 004 | 10,02 | 0,00 | 8 | 009 | -15,00 | -15,00 | 9 | 006 | 14,89 | -1,03 | 10 | 007 | 10,54 | -6,00 | 11 | 006 | 13,38 | 0,00 | 12 | 005 | 16,74 | 0,00| | 1 | 004 | -1,02 | -4,16 | 2 | 004 | -6,59 | -6,59 | 3 | 005 | 1,13 | 0,00 | 4 | 003 | 7,82 | 0,00 | 5 | 004 | 5,60 | 0,00 | 6 | 003 | 9,45 | -3,00 | 7 | 005 | 21,95 | 0,00 | 8 | 005 | 1,84 | -0,45 | 9 | 003 | 7,40 | 0,00 | 10 | 003 | 6,36 | 0,00 | 11 | 005 | 10,49 | -3,00 | 12 | 003 | -1,06 | -1,06| | 1 | 003 | 2,73 | 0,00 | 2 | 003 | -1,58 | -1,58 | 3 | 004 | 4,25 | 0,00 | 4 | 003 | -0,59 | -2,86 | 5 | 004 | 24,65 | -0,58
//    |NVTK|Max Williams A/D | 6|5|3|op:sell p:13,00 s: 5,00|NVTK|Min Williams A/D | 6|7|3|op:buy  p:13,00 s: 5,00|SBER|Max Williams A/D | 3|3|3|op:sell p:13,00 s: 5,00|SBER|Min Williams A/D |15|7|2|op:buy  p:13,00 s: 5,00| | 2010|026|018|  67,67|0,00|-10,32|2011|027|020|  86,56|-6,41| -6,41|2012|030|019|  59,43|-8,34| -9,72|2013|010|008|  29,24|-0,45|-13,20 |  | 1 | 002 | 0,94 | 0,00 | 2 | 004 | 37,77 | 0,00 | 3 | 004 | -3,34 | -5,64 | 4 | 004 | 5,90 | -2,42 | 5 | 003 | 14,90 | 0,00 | 6 | 003 | 4,89 | -3,91 | 7 | 003 | 12,45 | 0,00 | 8 | 004 | 3,25 | -3,97 | 9 | 004 | -7,32 | -8,31 | 10 | 004 | -10,32 | -10,32 | 11 | 005 | 5,03 | -10,00 | 12 | 004 | 3,54 | -5,00| | 1 | 003 | -6,41 | -6,41 | 2 | 004 | 12,23 | 0,00 | 3 | 004 | 2,52 | -5,00 | 4 | 004 | 0,39 | 0,00 | 5 | 003 | 7,20 | -0,80 | 6 | 003 | 3,77 | 0,00 | 7 | 005 | 1,80 | -5,00 | 8 | 005 | 15,94 | 0,00 | 9 | 004 | 10,10 | -0,98 | 10 | 005 | 14,42 | -5,00 | 11 | 003 | 17,81 | 0,00 | 12 | 004 | 6,78 | 0,00| | 1 | 004 | -3,07 | -3,07 | 2 | 005 | -5,26 | -5,26 | 3 | 004 | 3,36 | 0,00 | 4 | 004 | -1,61 | -2,89 | 5 | 004 | 6,64 | 0,00 | 6 | 005 | 29,54 | 0,00 | 7 | 004 | 24,27 | 0,00 | 8 | 004 | 2,13 | 0,00 | 9 | 003 | 2,28 | 0,00 | 10 | 004 | -9,72 | -9,72 | 11 | 004 | -2,07 | -3,55 | 12 | 004 | 12,93 | 0,00| | 1 | 003 | 2,20 | -0,45 | 2 | 003 | -1,66 | -1,66 | 3 | 005 | 15,85 | 0,00 | 4 | 004 | -4,18 | -13,20 | 5 | 003 | 17,02 | 0,00
//    |NVTK|Max Williams A/D | 6|5|3|op:sell p:13,00 s: 5,00|NVTK|Min Williams A/D | 6|7|3|op:buy  p:13,00 s: 5,00|SBER|Min Williams A/D |15|7|2|op:buy  p:13,00 s: 5,00|SBER|Max Williams A/D | 3|3|3|op:sell p:13,00 s: 5,00| | 2010|026|018|  67,67|0,00|-10,32|2011|027|020|  86,56|-6,41| -6,41|2012|030|018|  68,47|-8,34| -9,72|2013|010|008|  29,24|-0,45|-13,20 |  | 1 | 002 | 0,94 | 0,00 | 2 | 004 | 37,77 | 0,00 | 3 | 004 | -3,34 | -5,64 | 4 | 004 | 5,90 | -2,42 | 5 | 003 | 14,90 | 0,00 | 6 | 003 | 4,89 | -3,91 | 7 | 003 | 12,45 | 0,00 | 8 | 004 | 3,25 | -3,97 | 9 | 004 | -7,32 | -8,31 | 10 | 004 | -10,32 | -10,32 | 11 | 005 | 5,03 | -10,00 | 12 | 004 | 3,54 | -5,00| | 1 | 003 | -6,41 | -6,41 | 2 | 004 | 12,23 | 0,00 | 3 | 004 | 2,52 | -5,00 | 4 | 004 | 0,39 | 0,00 | 5 | 003 | 7,20 | -0,80 | 6 | 003 | 3,77 | 0,00 | 7 | 005 | 1,80 | -5,00 | 8 | 005 | 15,94 | 0,00 | 9 | 004 | 10,10 | -0,98 | 10 | 005 | 14,42 | -5,00 | 11 | 003 | 17,81 | 0,00 | 12 | 004 | 6,78 | 0,00| | 1 | 004 | -3,07 | -3,07 | 2 | 005 | -5,26 | -5,26 | 3 | 004 | 3,36 | 0,00 | 4 | 004 | -1,61 | -2,89 | 5 | 004 | 6,64 | 0,00 | 6 | 005 | 29,54 | 0,00 | 7 | 004 | 24,27 | 0,00 | 8 | 004 | 2,13 | 0,00 | 9 | 003 | 2,28 | 0,00 | 10 | 004 | -9,72 | -9,72 | 11 | 003 | 6,97 | 0,00 | 12 | 004 | 12,93 | 0,00| | 1 | 003 | 2,20 | -0,45 | 2 | 003 | -1,66 | -1,66 | 3 | 005 | 15,85 | 0,00 | 4 | 004 | -4,18 | -13,20 | 5 | 003 | 17,02 | 0,00
//    |NVTK|Max Williams A/D | 6|5|3|op:sell p:12,00 s: 5,00|SBER|Min Williams A/D |15|7|2|op:buy  p:12,00 s: 5,00|NVTK|Min Williams A/D | 6|7|3|op:buy  p:12,00 s: 5,00|SBER|Max Williams A/D | 3|3|3|op:sell p:12,00 s: 5,00| | 2010|026|019|  59,48|0,00|-10,32|2011|028|019|  83,81|-6,41| -6,41|2012|029|018|  65,17|-8,34| -9,72|2013|010|008|  29,24|-0,45|-13,20 |  | 1 | 002 | 0,94 | 0,00 | 2 | 004 | 32,40 | 0,00 | 3 | 004 | -3,34 | -5,64 | 4 | 004 | 5,90 | -2,42 | 5 | 004 | 12,19 | 0,00 | 6 | 003 | 4,89 | -3,91 | 7 | 003 | 11,45 | 0,00 | 8 | 004 | 3,25 | -3,97 | 9 | 004 | -7,32 | -8,31 | 10 | 004 | -10,32 | -10,32 | 11 | 005 | 5,92 | -10,00 | 12 | 004 | 3,54 | -5,00| | 1 | 003 | -6,41 | -6,41 | 2 | 004 | 8,74 | 0,00 | 3 | 004 | 2,52 | -5,00 | 4 | 004 | 0,39 | 0,00 | 5 | 003 | 8,73 | 0,00 | 6 | 003 | 3,77 | 0,00 | 7 | 005 | 1,80 | -5,00 | 8 | 005 | 17,34 | 0,00 | 9 | 004 | 6,02 | -0,98 | 10 | 005 | 16,30 | -5,00 | 11 | 003 | 17,81 | 0,00 | 12 | 004 | 6,78 | 0,00| | 1 | 004 | -3,07 | -3,07 | 2 | 005 | -5,26 | -5,26 | 3 | 003 | 4,13 | 0,00 | 4 | 004 | 5,24 | 0,00 | 5 | 004 | 0,82 | 0,00 | 6 | 005 | 24,45 | 0,00 | 7 | 004 | 24,27 | 0,00 | 8 | 004 | 2,13 | 0,00 | 9 | 003 | 2,28 | 0,00 | 10 | 004 | -9,72 | -9,72 | 11 | 003 | 6,97 | 0,00 | 12 | 004 | 12,93 | 0,00| | 1 | 003 | 2,20 | -0,45 | 2 | 003 | -1,66 | -1,66 | 3 | 005 | 15,85 | 0,00 | 4 | 004 | -4,18 | -13,20 | 5 | 003 | 17,02 | 0,00
//    |NVTK|Max Williams A/D | 6|5|3|op:sell p:13,00 s: 5,00|SBER|Min Williams A/D |15|7|2|op:buy  p:13,00 s: 5,00|NVTK|Min Williams A/D | 6|7|3|op:buy  p:13,00 s: 5,00|SBER|Max Williams A/D | 3|3|3|op:sell p:13,00 s: 5,00| | 2010|026|019|  61,59|0,00|-10,32|2011|028|019|  82,93|-6,41| -6,41|2012|029|018|  65,17|-8,34| -9,72|2013|010|008|  29,24|-0,45|-13,20 |  | 1 | 002 | 0,94 | 0,00 | 2 | 004 | 33,40 | 0,00 | 3 | 004 | -3,34 | -5,64 | 4 | 004 | 5,90 | -2,42 | 5 | 004 | 13,19 | 0,00 | 6 | 003 | 4,89 | -3,91 | 7 | 003 | 12,45 | 0,00 | 8 | 004 | 3,25 | -3,97 | 9 | 004 | -7,32 | -8,31 | 10 | 004 | -10,32 | -10,32 | 11 | 005 | 5,03 | -10,00 | 12 | 004 | 3,54 | -5,00| | 1 | 003 | -6,41 | -6,41 | 2 | 004 | 8,74 | 0,00 | 3 | 004 | 2,52 | -5,00 | 4 | 004 | 0,39 | 0,00 | 5 | 003 | 8,73 | 0,00 | 6 | 003 | 3,77 | 0,00 | 7 | 005 | 1,80 | -5,00 | 8 | 005 | 17,34 | 0,00 | 9 | 004 | 7,02 | -0,98 | 10 | 005 | 14,42 | -5,00 | 11 | 003 | 17,81 | 0,00 | 12 | 004 | 6,78 | 0,00| | 1 | 004 | -3,07 | -3,07 | 2 | 005 | -5,26 | -5,26 | 3 | 003 | 4,13 | 0,00 | 4 | 004 | 5,24 | 0,00 | 5 | 004 | 0,82 | 0,00 | 6 | 005 | 24,45 | 0,00 | 7 | 004 | 24,27 | 0,00 | 8 | 004 | 2,13 | 0,00 | 9 | 003 | 2,28 | 0,00 | 10 | 004 | -9,72 | -9,72 | 11 | 003 | 6,97 | 0,00 | 12 | 004 | 12,93 | 0,00| | 1 | 003 | 2,20 | -0,45 | 2 | 003 | -1,66 | -1,66 | 3 | 005 | 15,85 | 0,00 | 4 | 004 | -4,18 | -13,20 | 5 | 003 | 17,02 | 0,00
//    |NVTK|Min Williams A/D | 6|7|3|op:buy  p:13,00 s: 5,00|NVTK|Max Williams A/D | 6|5|3|op:sell p:13,00 s: 5,00|SBER|Max Williams A/D | 3|3|3|op:sell p:13,00 s: 5,00|SBER|Min Williams A/D |15|7|2|op:buy  p:13,00 s: 5,00| | 2010|026|018|  67,67|0,00|-10,32|2011|027|020|  86,56|-6,41| -6,41|2012|030|019|  59,43|-8,34| -9,72|2013|010|008|  29,24|-0,45|-13,20 |  | 1 | 002 | 0,94 | 0,00 | 2 | 004 | 37,77 | 0,00 | 3 | 004 | -3,34 | -5,64 | 4 | 004 | 5,90 | -2,42 | 5 | 003 | 14,90 | 0,00 | 6 | 003 | 4,89 | -3,91 | 7 | 003 | 12,45 | 0,00 | 8 | 004 | 3,25 | -3,97 | 9 | 004 | -7,32 | -8,31 | 10 | 004 | -10,32 | -10,32 | 11 | 005 | 5,03 | -10,00 | 12 | 004 | 3,54 | -5,00| | 1 | 003 | -6,41 | -6,41 | 2 | 004 | 12,23 | 0,00 | 3 | 004 | 2,52 | -5,00 | 4 | 004 | 0,39 | 0,00 | 5 | 003 | 7,20 | -0,80 | 6 | 003 | 3,77 | 0,00 | 7 | 005 | 1,80 | -5,00 | 8 | 005 | 15,94 | 0,00 | 9 | 004 | 10,10 | -0,98 | 10 | 005 | 14,42 | -5,00 | 11 | 003 | 17,81 | 0,00 | 12 | 004 | 6,78 | 0,00| | 1 | 004 | -3,07 | -3,07 | 2 | 005 | -5,26 | -5,26 | 3 | 004 | 3,36 | 0,00 | 4 | 004 | -1,61 | -2,89 | 5 | 004 | 6,64 | 0,00 | 6 | 005 | 29,54 | 0,00 | 7 | 004 | 24,27 | 0,00 | 8 | 004 | 2,13 | 0,00 | 9 | 003 | 2,28 | 0,00 | 10 | 004 | -9,72 | -9,72 | 11 | 004 | -2,07 | -3,55 | 12 | 004 | 12,93 | 0,00| | 1 | 003 | 2,20 | -0,45 | 2 | 003 | -1,66 | -1,66 | 3 | 005 | 15,85 | 0,00 | 4 | 004 | -4,18 | -13,20 | 5 | 003 | 17,02 | 0,00
//    |NVTK|Min Williams A/D | 6|7|3|op:buy  p:13,00 s: 5,00|NVTK|Max Williams A/D | 6|5|3|op:sell p:13,00 s: 5,00|SBER|Min Williams A/D |15|7|2|op:buy  p:13,00 s: 5,00|SBER|Max Williams A/D | 3|3|3|op:sell p:13,00 s: 5,00| | 2010|026|018|  67,67|0,00|-10,32|2011|027|020|  86,56|-6,41| -6,41|2012|030|018|  68,47|-8,34| -9,72|2013|010|008|  29,24|-0,45|-13,20 |  | 1 | 002 | 0,94 | 0,00 | 2 | 004 | 37,77 | 0,00 | 3 | 004 | -3,34 | -5,64 | 4 | 004 | 5,90 | -2,42 | 5 | 003 | 14,90 | 0,00 | 6 | 003 | 4,89 | -3,91 | 7 | 003 | 12,45 | 0,00 | 8 | 004 | 3,25 | -3,97 | 9 | 004 | -7,32 | -8,31 | 10 | 004 | -10,32 | -10,32 | 11 | 005 | 5,03 | -10,00 | 12 | 004 | 3,54 | -5,00| | 1 | 003 | -6,41 | -6,41 | 2 | 004 | 12,23 | 0,00 | 3 | 004 | 2,52 | -5,00 | 4 | 004 | 0,39 | 0,00 | 5 | 003 | 7,20 | -0,80 | 6 | 003 | 3,77 | 0,00 | 7 | 005 | 1,80 | -5,00 | 8 | 005 | 15,94 | 0,00 | 9 | 004 | 10,10 | -0,98 | 10 | 005 | 14,42 | -5,00 | 11 | 003 | 17,81 | 0,00 | 12 | 004 | 6,78 | 0,00| | 1 | 004 | -3,07 | -3,07 | 2 | 005 | -5,26 | -5,26 | 3 | 004 | 3,36 | 0,00 | 4 | 004 | -1,61 | -2,89 | 5 | 004 | 6,64 | 0,00 | 6 | 005 | 29,54 | 0,00 | 7 | 004 | 24,27 | 0,00 | 8 | 004 | 2,13 | 0,00 | 9 | 003 | 2,28 | 0,00 | 10 | 004 | -9,72 | -9,72 | 11 | 003 | 6,97 | 0,00 | 12 | 004 | 12,93 | 0,00| | 1 | 003 | 2,20 | -0,45 | 2 | 003 | -1,66 | -1,66 | 3 | 005 | 15,85 | 0,00 | 4 | 004 | -4,18 | -13,20 | 5 | 003 | 17,02 | 0,00
    test("sber VS nvtk"){ checkCombination(nvtkBestStrategies, DayStandardImporter.nvtk, 58) }
//    |ROSN|Max Williams A/D | 3|4|2|op:sell p:12,00 s: 3,00|SBER|Max Williams A/D | 6|6|1|op:sell p:12,00 s: 3,00|ROSN|Min Williams A/D |12|3|3|op:buy  p:12,00 s: 3,00|SBER|Min Williams A/D | 6|6|2|op:buy  p:12,00 s: 3,00| | 2010|034|023|  70,32|0,00| -6,00|2011|031|028|  54,55|-3,61|-15,00|2012|030|020|  50,31|-14,08|-12,00|2013|015|008|  29,58|-3,71| -3,71 |  | 1 | 002 | 4,75 | 0,00 | 2 | 005 | 21,14 | 0,00 | 3 | 005 | 7,38 | 0,00 | 4 | 004 | 7,70 | 0,00 | 5 | 005 | 18,31 | -3,00 | 6 | 006 | 6,58 | -4,27 | 7 | 007 | 4,34 | -3,19 | 8 | 004 | 7,51 | 0,00 | 9 | 005 | -5,85 | -6,00 | 10 | 004 | 2,28 | 0,00 | 11 | 005 | -2,62 | -2,84 | 12 | 005 | -1,21 | -6,00| | 1 | 003 | -1,82 | -3,00 | 2 | 004 | -1,40 | -1,40 | 3 | 006 | 12,93 | -0,39 | 4 | 005 | 7,82 | 0,00 | 5 | 005 | -1,12 | -2,21 | 6 | 004 | -1,13 | -3,00 | 7 | 004 | 7,22 | 0,00 | 8 | 009 | -4,14 | -15,00 | 9 | 005 | 18,68 | 0,00 | 10 | 006 | -9,34 | -12,01 | 11 | 003 | 24,78 | 0,00 | 12 | 005 | 2,08 | -0,02| | 1 | 005 | -2,08 | -4,96 | 2 | 004 | -12,00 | -12,00 | 3 | 004 | 7,97 | 0,00 | 4 | 006 | 6,25 | -3,97 | 5 | 005 | 11,52 | -6,00 | 6 | 003 | 10,81 | -3,00 | 7 | 004 | 14,52 | 0,00 | 8 | 004 | 7,29 | 0,00 | 9 | 004 | 8,42 | 0,00 | 10 | 004 | 1,22 | 0,00 | 11 | 003 | 2,73 | 0,00 | 12 | 004 | -6,33 | -6,33| | 1 | 004 | 0,73 | -3,71 | 2 | 003 | 3,60 | -0,85 | 3 | 005 | 7,85 | 0,00 | 4 | 005 | 17,50 | -3,00 | 5 | 004 | 2,32 | -2,85 | 6 | 002 | -2,40 | -2,40
//    |ROSN|Max Williams A/D | 3|6|1|op:sell p:11,00 s: 4,00|ROSN|Min Williams A/D | 3|3|3|op:buy  p:11,00 s: 4,00|SBER|Max Williams A/D | 3|3|1|op:sell p:11,00 s: 4,00|SBER|Min Williams A/D | 3|5|3|op:buy  p:11,00 s: 4,00| | 2010|031|021|  61,90|0,00| -6,81|2011|031|028|  50,20|-6,07|-16,00|2012|034|020|  56,63|-1,68|-16,80|2013|016|008|  39,88|-0,25| -2,56 |  | 1 | 003 | 6,46 | 0,00 | 2 | 005 | 11,29 | 0,00 | 3 | 005 | -2,38 | -2,57 | 4 | 005 | 10,55 | -0,83 | 5 | 003 | 21,79 | 0,00 | 6 | 004 | 11,95 | 0,00 | 7 | 006 | -3,40 | -3,64 | 8 | 005 | 4,48 | 0,00 | 9 | 004 | -6,81 | -6,81 | 10 | 004 | 6,72 | -0,88 | 11 | 003 | 1,36 | -0,26 | 12 | 005 | -0,10 | -0,10| | 1 | 003 | -6,07 | -6,07 | 2 | 004 | 10,73 | 0,00 | 3 | 005 | 1,66 | -6,70 | 4 | 006 | 6,75 | 0,00 | 5 | 005 | 5,31 | -0,52 | 6 | 004 | -1,81 | -5,88 | 7 | 006 | -1,36 | -4,00 | 8 | 008 | 2,82 | -16,00 | 9 | 005 | 14,45 | 0,00 | 10 | 005 | 15,12 | 0,00 | 11 | 004 | 0,75 | 0,00 | 12 | 004 | 1,85 | 0,00| | 1 | 003 | 4,15 | -1,68 | 2 | 005 | 7,02 | 0,00 | 3 | 004 | 10,72 | 0,00 | 4 | 004 | 7,28 | 0,00 | 5 | 006 | 24,77 | 0,00 | 6 | 003 | 6,91 | -1,94 | 7 | 005 | 19,66 | 0,00 | 8 | 004 | -0,52 | -1,79 | 9 | 005 | -1,40 | -7,46 | 10 | 006 | -16,80 | -16,80 | 11 | 004 | 4,61 | -2,30 | 12 | 005 | -9,77 | -10,93| | 1 | 003 | 1,11 | -0,25 | 2 | 005 | 12,45 | 0,00 | 3 | 004 | 9,43 | 0,00 | 4 | 006 | 7,49 | 0,00 | 5 | 004 | 11,95 | -1,82 | 6 | 002 | -2,56 | -2,56
//    |ROSN|Max Williams A/D | 3|6|1|op:sell p:12,00 s: 4,00|ROSN|Min Williams A/D | 3|3|3|op:buy  p:12,00 s: 4,00|SBER|Max Williams A/D | 3|3|1|op:sell p:12,00 s: 4,00|SBER|Min Williams A/D | 3|5|3|op:buy  p:12,00 s: 4,00| | 2010|030|021|  62,30|0,00| -6,81|2011|031|028|  52,22|-6,07|-16,00|2012|034|020|  56,63|-1,68|-16,80|2013|016|008|  40,88|-0,25| -2,56 |  | 1 | 003 | 6,46 | 0,00 | 2 | 004 | 9,69 | 0,00 | 3 | 005 | -2,38 | -2,57 | 4 | 005 | 11,55 | -0,83 | 5 | 003 | 22,79 | 0,00 | 6 | 004 | 11,95 | 0,00 | 7 | 006 | -3,40 | -3,64 | 8 | 005 | 4,48 | 0,00 | 9 | 004 | -6,81 | -6,81 | 10 | 004 | 6,72 | -0,88 | 11 | 003 | 1,36 | -0,26 | 12 | 005 | -0,10 | -0,10| | 1 | 003 | -6,07 | -6,07 | 2 | 004 | 10,73 | 0,00 | 3 | 005 | 1,66 | -6,70 | 4 | 006 | 6,75 | 0,00 | 5 | 005 | 5,31 | -0,52 | 6 | 004 | -1,81 | -5,88 | 7 | 006 | -1,36 | -4,00 | 8 | 008 | 3,82 | -16,00 | 9 | 005 | 15,45 | 0,00 | 10 | 005 | 15,13 | 0,00 | 11 | 004 | 0,75 | 0,00 | 12 | 004 | 1,85 | 0,00| | 1 | 003 | 4,15 | -1,68 | 2 | 005 | 7,02 | 0,00 | 3 | 004 | 10,72 | 0,00 | 4 | 004 | 7,28 | 0,00 | 5 | 006 | 24,77 | 0,00 | 6 | 003 | 6,91 | -1,94 | 7 | 005 | 19,66 | 0,00 | 8 | 004 | -0,52 | -1,79 | 9 | 005 | -1,40 | -7,46 | 10 | 006 | -16,80 | -16,80 | 11 | 004 | 4,61 | -2,30 | 12 | 005 | -9,77 | -10,93| | 1 | 003 | 1,11 | -0,25 | 2 | 005 | 12,45 | 0,00 | 3 | 004 | 9,43 | 0,00 | 4 | 006 | 7,49 | 0,00 | 5 | 004 | 12,95 | -1,82 | 6 | 002 | -2,56 | -2,56
//    |ROSN|Max Williams A/D | 3|3|3|op:sell p: 8,00 s: 5,00|SBER|Max Williams A/D | 3|3|2|op:sell p: 8,00 s: 5,00|SBER|Min Williams A/D | 3|7|2|op:buy  p: 8,00 s: 5,00|ROSN|Min Williams A/D |15|4|2|op:buy  p: 8,00 s: 5,00| | 2010|036|026|  56,68|-5,19|-12,42|2011|037|027|  50,84|-16,06|-10,52|2012|037|025|  59,84|-0,62| -9,94|2013|017|008|  28,06|-0,68| -0,68 |  | 1 | 003 | 4,25 | -5,00 | 2 | 004 | -1,27 | -1,27 | 3 | 006 | 4,24 | -1,88 | 4 | 005 | -6,92 | -12,42 | 5 | 006 | 25,59 | 0,00 | 6 | 006 | 7,28 | -1,62 | 7 | 005 | 20,76 | 0,00 | 8 | 005 | 2,84 | -2,79 | 9 | 006 | -7,06 | -7,06 | 10 | 007 | -2,17 | -7,26 | 11 | 004 | 6,50 | 0,00 | 12 | 005 | 2,63 | -0,92| | 1 | 002 | 3,38 | 0,00 | 2 | 004 | 2,23 | -4,49 | 3 | 005 | -7,77 | -7,77 | 4 | 005 | -5,06 | -5,06 | 5 | 003 | 0,78 | -4,31 | 6 | 004 | 5,71 | -0,06 | 7 | 006 | -5,33 | -5,33 | 8 | 007 | 11,58 | -10,00 | 9 | 007 | 23,13 | -1,06 | 10 | 007 | 12,53 | -5,00 | 11 | 006 | 20,18 | 0,00 | 12 | 008 | -10,52 | -10,52| | 1 | 006 | 0,54 | -0,62 | 2 | 005 | 12,11 | 0,00 | 3 | 005 | -0,26 | -1,33 | 4 | 005 | 0,47 | -0,88 | 5 | 006 | 12,73 | 0,00 | 6 | 005 | 3,86 | -4,14 | 7 | 007 | 17,68 | 0,00 | 8 | 005 | 7,17 | 0,00 | 9 | 003 | 3,31 | 0,00 | 10 | 007 | -9,94 | -9,94 | 11 | 004 | 9,03 | 0,00 | 12 | 004 | 3,14 | -3,08| | 1 | 005 | 3,28 | -0,68 | 2 | 004 | 1,89 | -0,49 | 3 | 004 | 5,89 | 0,00 | 4 | 004 | 3,51 | 0,00 | 5 | 006 | 13,28 | 0,00 | 6 | 002 | 0,21 | 0,00
//    |ROSN|Max Williams A/D | 3|3|3|op:sell p: 8,00 s: 5,00|SBER|Min Williams A/D | 3|7|2|op:buy  p: 8,00 s: 5,00|SBER|Max Williams A/D | 3|3|2|op:sell p: 8,00 s: 5,00|ROSN|Min Williams A/D |15|4|2|op:buy  p: 8,00 s: 5,00| | 2010|036|026|  56,68|-5,19|-12,42|2011|037|027|  50,84|-16,06|-10,52|2012|037|025|  59,84|-0,62| -9,94|2013|017|008|  28,06|-0,68| -0,68 |  | 1 | 003 | 4,25 | -5,00 | 2 | 004 | -1,27 | -1,27 | 3 | 006 | 4,24 | -1,88 | 4 | 005 | -6,92 | -12,42 | 5 | 006 | 25,59 | 0,00 | 6 | 006 | 7,28 | -1,62 | 7 | 005 | 20,76 | 0,00 | 8 | 005 | 2,84 | -2,79 | 9 | 006 | -7,06 | -7,06 | 10 | 007 | -2,17 | -7,26 | 11 | 004 | 6,50 | 0,00 | 12 | 005 | 2,63 | -0,92| | 1 | 002 | 3,38 | 0,00 | 2 | 004 | 2,23 | -4,49 | 3 | 005 | -7,77 | -7,77 | 4 | 005 | -5,06 | -5,06 | 5 | 003 | 0,78 | -4,31 | 6 | 004 | 5,71 | -0,06 | 7 | 006 | -5,33 | -5,33 | 8 | 007 | 11,58 | -10,00 | 9 | 007 | 23,13 | -1,06 | 10 | 007 | 12,53 | -5,00 | 11 | 006 | 20,18 | 0,00 | 12 | 008 | -10,52 | -10,52| | 1 | 006 | 0,54 | -0,62 | 2 | 005 | 12,11 | 0,00 | 3 | 005 | -0,26 | -1,33 | 4 | 005 | 0,47 | -0,88 | 5 | 006 | 12,73 | 0,00 | 6 | 005 | 3,86 | -4,14 | 7 | 007 | 17,68 | 0,00 | 8 | 005 | 7,17 | 0,00 | 9 | 003 | 3,31 | 0,00 | 10 | 007 | -9,94 | -9,94 | 11 | 004 | 9,03 | 0,00 | 12 | 004 | 3,14 | -3,08| | 1 | 005 | 3,28 | -0,68 | 2 | 004 | 1,89 | -0,49 | 3 | 004 | 5,89 | 0,00 | 4 | 004 | 3,51 | 0,00 | 5 | 006 | 13,28 | 0,00 | 6 | 002 | 0,21 | 0,00
    test("sber VS rosn"){ checkCombination(rosnBestStrategies, DayStandardImporter.rosn, 50) }
//    меньше 50 %
    test("sber VS rtkm"){ checkCombination(rtkmBestStrategies, DayStandardImporter.rtkm, 50) }

    def checkCombination(otherStrategies: Vector[(WilliamsAdMax, WilliamsAdMin)], otherData: TradingData, targetProfit: Int)
    {
        checkCombination(DayStandardImporter.sber, sberBestStrategies, otherData, otherStrategies, targetProfit)
    }
}
