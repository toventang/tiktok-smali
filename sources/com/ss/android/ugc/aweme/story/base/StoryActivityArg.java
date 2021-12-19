package com.ss.android.ugc.aweme.story.base;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import h.f.b.g;
import h.f.b.l;

public final class StoryActivityArg implements IRouteArg {
    public static final Parcelable.Creator<StoryActivityArg> CREATOR = new a();
    private final EnterStoryParam enterStoryParam;

    static {
        Covode.recordClassIndex(89444);
    }

    public StoryActivityArg() {
        this(null, 1, null);
    }

    public static StoryActivityArg __fromBundle(Bundle bundle) {
        EnterStoryParam enterStoryParam2;
        if (bundle == null) {
            return null;
        }
        int i2 = 0;
        if (bundle.containsKey("enter_story_param")) {
            enterStoryParam2 = (EnterStoryParam) RouteParser.INSTANCE.parse(bundle.get("enter_story_param"), EnterStoryParam.class);
        } else {
            i2 = 1;
            enterStoryParam2 = null;
        }
        return new StoryActivityArg(enterStoryParam2, i2, null);
    }

    public static /* synthetic */ StoryActivityArg copy$default(StoryActivityArg storyActivityArg, EnterStoryParam enterStoryParam2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            enterStoryParam2 = storyActivityArg.enterStoryParam;
        }
        return storyActivityArg.copy(enterStoryParam2);
    }

    public final EnterStoryParam component1() {
        return this.enterStoryParam;
    }

    public final StoryActivityArg copy(EnterStoryParam enterStoryParam2) {
        l.d(enterStoryParam2, "");
        return new StoryActivityArg(enterStoryParam2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StoryActivityArg) && l.a(this.enterStoryParam, ((StoryActivityArg) obj).enterStoryParam);
        }
        return true;
    }

    public final int hashCode() {
        EnterStoryParam enterStoryParam2 = this.enterStoryParam;
        if (enterStoryParam2 != null) {
            return enterStoryParam2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryActivityArg(enterStoryParam=" + this.enterStoryParam + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeParcelable(this.enterStoryParam, i2);
    }

    public final EnterStoryParam getEnterStoryParam() {
        return this.enterStoryParam;
    }

    public static class a implements Parcelable.Creator<StoryActivityArg> {
        static {
            Covode.recordClassIndex(89445);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StoryActivityArg[] newArray(int i2) {
            return new StoryActivityArg[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StoryActivityArg createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new StoryActivityArg((EnterStoryParam) parcel.readParcelable(StoryActivityArg.class.getClassLoader()));
        }
    }

    public StoryActivityArg(EnterStoryParam enterStoryParam2) {
        l.d(enterStoryParam2, "");
        this.enterStoryParam = enterStoryParam2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryActivityArg(EnterStoryParam enterStoryParam2, int i2, g gVar) {
        this((i2 & 1) != 0 ? new EnterStoryParam(null, null, null, false, false, false, false, 127, null) : enterStoryParam2);
    }
}
