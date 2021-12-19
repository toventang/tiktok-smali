package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class DutyGiftInfo {
    @c(a = "duty_id")
    public long mDutyId;
    @c(a = "speedy_gift_id")
    private long mGiftId;
    @c(a = "contribute_most")
    private User mMvpUser;
    @c(a = "score")
    private long mScore;
    @c(a = "stage_count")
    private long mStageCount;
    @c(a = "status")
    private int mStatus;
    private int mSuccess;
    @c(a = "target_score")
    private long mTargetScore;

    static {
        Covode.recordClassIndex(3722);
    }

    public long getDutyId() {
        return this.mDutyId;
    }

    public long getGiftId() {
        return this.mGiftId;
    }

    public User getMvpUser() {
        return this.mMvpUser;
    }

    public long getScore() {
        return this.mScore;
    }

    public long getStageCount() {
        return this.mStageCount;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public long getTargetScore() {
        return this.mTargetScore;
    }

    public int isSuccess() {
        return this.mSuccess;
    }

    public boolean isFinished() {
        if (this.mStatus == 4) {
            return true;
        }
        return false;
    }

    public boolean isPlaying() {
        if (this.mStatus == 3) {
            return true;
        }
        return false;
    }

    public boolean isStarted() {
        if (this.mStatus == 2) {
            return true;
        }
        return false;
    }

    public void setDutyId(long j2) {
        this.mDutyId = j2;
    }

    public void setGiftId(long j2) {
        this.mGiftId = j2;
    }

    public void setMvpUser(User user) {
        this.mMvpUser = user;
    }

    public void setScore(long j2) {
        this.mScore = j2;
    }

    public void setStageCount(long j2) {
        this.mStageCount = j2;
    }

    public void setStatus(int i2) {
        this.mStatus = i2;
    }

    public void setSuccess(int i2) {
        this.mSuccess = i2;
    }

    public void setTargetScore(long j2) {
        this.mTargetScore = j2;
    }
}
