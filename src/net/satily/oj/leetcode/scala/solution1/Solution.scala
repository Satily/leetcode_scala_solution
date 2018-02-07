package net.satily.oj.leetcode.scala.solution1

object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        val numsMap = nums.foldLeft(Map[Int, Int]())((r, c) => r.updated(c, r.getOrElse(c, 0) + 1))
        Array(nums.indexWhere(num =>
            target - num != num && numsMap.getOrElse(target - num, 0) == 1
                    || target - num == num && numsMap.getOrElse(num, 0) >= 2))
                .flatMap(index => Array(nums.lastIndexWhere(_ == target - nums(index)), index))
                .sorted
    }
}

object Main {
    def main(args: Array[String]): Unit = {
        Solution.twoSum(Array(230,863,916,585,981,404,316,785,88,12,70,435,384,778,887,755,740,337,86,92,325,422,815,650,920,125,277,336,221,847,168,23,677,61,400,136,874,363,394,199,863,997,794,587,124,321,212,957,764,173,314,422,927,783,930,282,306,506,44,926,691,568,68,730,933,737,531,180,414,751,28,546,60,371,493,370,527,387,43,541,13,457,328,227,652,365,430,803,59,858,538,427,583,368,375,173,809,896,370,789), 542).foreach(println(_))
    }
}