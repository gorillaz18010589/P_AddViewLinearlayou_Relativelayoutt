package com.example.p_addview_linearlayout;

import java.util.List;

class Data {

    /**
     * DailySignInActivities : [{"DayNum":1,"BelongDate":"2020-11-11T00:00:00","StartTime":"2020-11-11T00:00:00","EndTime":"2020-11-12T23:59:59","Status":2,"Bonus":20,"ConditionSeq":1},{"DayNum":1,"BelongDate":"2020-11-11T00:00:00","StartTime":"2020-11-11T00:00:00","EndTime":"2020-11-12T23:59:59","Status":2,"Bonus":50,"ConditionSeq":2},{"DayNum":2,"BelongDate":"2020-11-12T00:00:00","StartTime":"2020-11-12T00:00:00","EndTime":"2020-11-13T23:59:59","Status":2,"Bonus":20,"ConditionSeq":1},{"DayNum":2,"BelongDate":"2020-11-12T00:00:00","StartTime":"2020-11-12T00:00:00","EndTime":"2020-11-13T23:59:59","Status":2,"Bonus":50,"ConditionSeq":2},{"DayNum":3,"BelongDate":"2020-11-13T00:00:00","StartTime":"2020-11-13T00:00:00","EndTime":"2020-11-14T23:59:59","Status":2,"Bonus":20,"ConditionSeq":1},{"DayNum":3,"BelongDate":"2020-11-13T00:00:00","StartTime":"2020-11-13T00:00:00","EndTime":"2020-11-14T23:59:59","Status":2,"Bonus":50,"ConditionSeq":2},{"DayNum":4,"BelongDate":"2020-11-14T00:00:00","StartTime":"2020-11-14T00:00:00","EndTime":"2020-11-15T23:59:59","Status":2,"Bonus":20,"ConditionSeq":1},{"DayNum":4,"BelongDate":"2020-11-14T00:00:00","StartTime":"2020-11-14T00:00:00","EndTime":"2020-11-15T23:59:59","Status":2,"Bonus":50,"ConditionSeq":2},{"DayNum":5,"BelongDate":"2020-11-15T00:00:00","StartTime":"2020-11-15T00:00:00","EndTime":"2020-11-16T23:59:59","Status":2,"Bonus":20,"ConditionSeq":1},{"DayNum":5,"BelongDate":"2020-11-15T00:00:00","StartTime":"2020-11-15T00:00:00","EndTime":"2020-11-16T23:59:59","Status":2,"Bonus":50,"ConditionSeq":2},{"DayNum":6,"BelongDate":"2020-11-16T00:00:00","StartTime":"2020-11-16T00:00:00","EndTime":"2020-11-17T23:59:59","Status":2,"Bonus":20,"ConditionSeq":1},{"DayNum":6,"BelongDate":"2020-11-16T00:00:00","StartTime":"2020-11-16T00:00:00","EndTime":"2020-11-17T23:59:59","Status":2,"Bonus":50,"ConditionSeq":2},{"DayNum":7,"BelongDate":"2020-11-17T00:00:00","StartTime":"2020-11-17T00:00:00","EndTime":"2020-11-18T23:59:59","Status":3,"Bonus":20,"ConditionSeq":1},{"DayNum":7,"BelongDate":"2020-11-17T00:00:00","StartTime":"2020-11-17T00:00:00","EndTime":"2020-11-18T23:59:59","Status":3,"Bonus":50,"ConditionSeq":2}]
     * DailySignInContinuous : [{"ContinuousDays":7,"ContinuousBonus":30,"ContinuousStatus":0,"ConditionSeq":1,"NeedDailyBet":10,"NeedDailyDeposit":15},{"ContinuousDays":7,"ContinuousBonus":100,"ContinuousStatus":0,"ConditionSeq":2,"NeedDailyBet":15,"NeedDailyDeposit":20}]
     * ActivityRule : <p>
     <span>ㄏ哈哈哈哈哈哈哈哈</span>
     </p>
     <p>
     <span>ㄏ哈哈哈哈哈哈哈哈</span>
     </p>
     <p>
     <span>ㄏ哈哈哈哈哈哈哈哈</span>
     </p>
     <p>
     <span>ㄏ哈哈哈哈哈哈哈哈</span>
     </p>
     <p>
     <span>ㄏ哈哈哈哈哈哈哈哈</span>
     </p>
     <p>
     <span>ㄏ哈哈哈哈哈哈哈哈</span>
     </p>
     <p>
     <br />
     </p>
     <p>
     <br />
     </p>
     * ActivityStartTime : 2020-11-11T00:00:00
     * ActivityEndTime : 2020-11-19T23:59:59
     * DisplayStartTime : 2020-11-11T00:00:00
     * DisplayEndTime : 2020-11-20T23:59:59
     * TodayBonus : 0
     * YesterdayBonus : 20
     * StillNeedBet : 0
     * StillNeedDeposit : 0
     * JudgeType : 3
     * GameFilterType : 1
     * GameFilterName : 全部类型
     * AuditMultiple : 0
     */

    private String ActivityRule;
    private String ActivityStartTime;
    private String ActivityEndTime;
    private String DisplayStartTime;
    private String DisplayEndTime;
    private int TodayBonus;
    private int YesterdayBonus;
    private int StillNeedBet;
    private int StillNeedDeposit;
    private int JudgeType;
    private int GameFilterType;
    private String GameFilterName;
    private int AuditMultiple;
    private List<DailySignInActivitiesBean> DailySignInActivities;
    private List<DailySignInContinuousBean> DailySignInContinuous;

    public String getActivityRule() {
        return ActivityRule;
    }

    public void setActivityRule(String ActivityRule) {
        this.ActivityRule = ActivityRule;
    }

    public String getActivityStartTime() {
        return ActivityStartTime;
    }

    public void setActivityStartTime(String ActivityStartTime) {
        this.ActivityStartTime = ActivityStartTime;
    }

    public String getActivityEndTime() {
        return ActivityEndTime;
    }

    public void setActivityEndTime(String ActivityEndTime) {
        this.ActivityEndTime = ActivityEndTime;
    }

    public String getDisplayStartTime() {
        return DisplayStartTime;
    }

    public void setDisplayStartTime(String DisplayStartTime) {
        this.DisplayStartTime = DisplayStartTime;
    }

    public String getDisplayEndTime() {
        return DisplayEndTime;
    }

    public void setDisplayEndTime(String DisplayEndTime) {
        this.DisplayEndTime = DisplayEndTime;
    }

    public int getTodayBonus() {
        return TodayBonus;
    }

    public void setTodayBonus(int TodayBonus) {
        this.TodayBonus = TodayBonus;
    }

    public int getYesterdayBonus() {
        return YesterdayBonus;
    }

    public void setYesterdayBonus(int YesterdayBonus) {
        this.YesterdayBonus = YesterdayBonus;
    }

    public int getStillNeedBet() {
        return StillNeedBet;
    }

    public void setStillNeedBet(int StillNeedBet) {
        this.StillNeedBet = StillNeedBet;
    }

    public int getStillNeedDeposit() {
        return StillNeedDeposit;
    }

    public void setStillNeedDeposit(int StillNeedDeposit) {
        this.StillNeedDeposit = StillNeedDeposit;
    }

    public int getJudgeType() {
        return JudgeType;
    }

    public void setJudgeType(int JudgeType) {
        this.JudgeType = JudgeType;
    }

    public int getGameFilterType() {
        return GameFilterType;
    }

    public void setGameFilterType(int GameFilterType) {
        this.GameFilterType = GameFilterType;
    }

    public String getGameFilterName() {
        return GameFilterName;
    }

    public void setGameFilterName(String GameFilterName) {
        this.GameFilterName = GameFilterName;
    }

    public int getAuditMultiple() {
        return AuditMultiple;
    }

    public void setAuditMultiple(int AuditMultiple) {
        this.AuditMultiple = AuditMultiple;
    }

    public List<DailySignInActivitiesBean> getDailySignInActivities() {
        return DailySignInActivities;
    }

    public void setDailySignInActivities(List<DailySignInActivitiesBean> DailySignInActivities) {
        this.DailySignInActivities = DailySignInActivities;
    }

    public List<DailySignInContinuousBean> getDailySignInContinuous() {
        return DailySignInContinuous;
    }

    public void setDailySignInContinuous(List<DailySignInContinuousBean> DailySignInContinuous) {
        this.DailySignInContinuous = DailySignInContinuous;
    }

    public static class DailySignInActivitiesBean {
        /**
         * DayNum : 1
         * BelongDate : 2020-11-11T00:00:00
         * StartTime : 2020-11-11T00:00:00
         * EndTime : 2020-11-12T23:59:59
         * Status : 2
         * Bonus : 20
         * ConditionSeq : 1
         */

        private int DayNum;
        private String BelongDate;
        private String StartTime;
        private String EndTime;
        private int Status;
        private int Bonus;
        private int ConditionSeq;

        public int getDayNum() {
            return DayNum;
        }

        public void setDayNum(int DayNum) {
            this.DayNum = DayNum;
        }

        public String getBelongDate() {
            return BelongDate;
        }

        public void setBelongDate(String BelongDate) {
            this.BelongDate = BelongDate;
        }

        public String getStartTime() {
            return StartTime;
        }

        public void setStartTime(String StartTime) {
            this.StartTime = StartTime;
        }

        public String getEndTime() {
            return EndTime;
        }

        public void setEndTime(String EndTime) {
            this.EndTime = EndTime;
        }

        public int getStatus() {
            return Status;
        }

        public void setStatus(int Status) {
            this.Status = Status;
        }

        public int getBonus() {
            return Bonus;
        }

        public void setBonus(int Bonus) {
            this.Bonus = Bonus;
        }

        public int getConditionSeq() {
            return ConditionSeq;
        }

        public void setConditionSeq(int ConditionSeq) {
            this.ConditionSeq = ConditionSeq;
        }
    }

    public static class DailySignInContinuousBean {
        /**
         * ContinuousDays : 7
         * ContinuousBonus : 30
         * ContinuousStatus : 0
         * ConditionSeq : 1
         * NeedDailyBet : 10
         * NeedDailyDeposit : 15
         */

        private int ContinuousDays;
        private int ContinuousBonus;
        private int ContinuousStatus;
        private int ConditionSeq;
        private int NeedDailyBet;
        private int NeedDailyDeposit;

        public int getContinuousDays() {
            return ContinuousDays;
        }

        public void setContinuousDays(int ContinuousDays) {
            this.ContinuousDays = ContinuousDays;
        }

        public int getContinuousBonus() {
            return ContinuousBonus;
        }

        public void setContinuousBonus(int ContinuousBonus) {
            this.ContinuousBonus = ContinuousBonus;
        }

        public int getContinuousStatus() {
            return ContinuousStatus;
        }

        public void setContinuousStatus(int ContinuousStatus) {
            this.ContinuousStatus = ContinuousStatus;
        }

        public int getConditionSeq() {
            return ConditionSeq;
        }

        public void setConditionSeq(int ConditionSeq) {
            this.ConditionSeq = ConditionSeq;
        }

        public int getNeedDailyBet() {
            return NeedDailyBet;
        }

        public void setNeedDailyBet(int NeedDailyBet) {
            this.NeedDailyBet = NeedDailyBet;
        }

        public int getNeedDailyDeposit() {
            return NeedDailyDeposit;
        }

        public void setNeedDailyDeposit(int NeedDailyDeposit) {
            this.NeedDailyDeposit = NeedDailyDeposit;
        }
    }
}
