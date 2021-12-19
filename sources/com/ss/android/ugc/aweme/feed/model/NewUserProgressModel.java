package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.n;
import h.f.a.b;
import h.f.b.g;
import h.m.p;
import java.io.Serializable;
import java.util.List;
import java.util.NoSuchElementException;

public final class NewUserProgressModel implements Serializable {
    @c(a = "ab_version")
    private String abVersion;
    @c(a = "progress_bar_info")
    private ProgressBarInfo progressBarInfo;
    @c(a = "swipe_up_text")
    private SwipeUpText swipeUpText;

    public enum ProgressBarStyle {
        PERCENTAGE(1),
        DURATION(2);
        
        public static final Companion Companion = new Companion(null);
        private int type;

        public static final class Companion {
            static {
                Covode.recordClassIndex(59436);
            }

            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final ProgressBarStyle fromInt(int i2) {
                ProgressBarStyle[] values = ProgressBarStyle.values();
                for (ProgressBarStyle progressBarStyle : values) {
                    if (progressBarStyle.getType() == i2) {
                        return progressBarStyle;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        public final int getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(59435);
        }

        public final void setType(int i2) {
            this.type = i2;
        }

        private ProgressBarStyle(int i2) {
            this.type = i2;
        }
    }

    static {
        Covode.recordClassIndex(59433);
    }

    public static final class ProgressBarInfo implements Serializable {
        @c(a = "is_default_color")
        private Boolean isDefaultColor = false;
        @c(a = "is_dismissible")
        private Boolean isProgressBarDismissable = false;
        @c(a = "should_show_progress_bar")
        private Boolean shouldShowProgressBar = false;
        @c(a = "stages")
        private List<Stage> stages;
        @c(a = "style")
        private Integer style;
        @c(a = "text_button_keep")
        private String textButtonKeep = "";
        @c(a = "text_button_turn_off")
        private String textButtonTurnOff = "";
        @c(a = "text_progress_complete")
        private String textProgressComplete = "";
        @c(a = "text_remove_body")
        private String textRemoveBody = "";
        @c(a = "text_remove_title")
        private String textRemoveTitle = "";
        @c(a = "text_skip_video_reminder")
        private String textSkipVideoReminder = "";
        @c(a = "text_tap_body")
        private String textTapBody = "";
        @c(a = "text_tap_title")
        private String textTapTitle = "";
        @c(a = "video_skip_duration")
        private String videoSkipDuration = "";

        static {
            Covode.recordClassIndex(59434);
        }

        public final Boolean getShouldShowProgressBar() {
            return this.shouldShowProgressBar;
        }

        public final List<Stage> getStages() {
            return this.stages;
        }

        public final Integer getStyle() {
            return this.style;
        }

        public final String getTextButtonKeep() {
            return this.textButtonKeep;
        }

        public final String getTextButtonTurnOff() {
            return this.textButtonTurnOff;
        }

        public final String getTextProgressComplete() {
            return this.textProgressComplete;
        }

        public final String getTextRemoveBody() {
            return this.textRemoveBody;
        }

        public final String getTextRemoveTitle() {
            return this.textRemoveTitle;
        }

        public final String getTextSkipVideoReminder() {
            return this.textSkipVideoReminder;
        }

        public final String getTextTapBody() {
            return this.textTapBody;
        }

        public final String getTextTapTitle() {
            return this.textTapTitle;
        }

        public final String getVideoSkipDuration() {
            return this.videoSkipDuration;
        }

        public final Boolean isDefaultColor() {
            return this.isDefaultColor;
        }

        public final Boolean isProgressBarDismissable() {
            return this.isProgressBarDismissable;
        }

        public final String toString() {
            return "ProgressBarInfo {shouldShowProgressBar='" + this.shouldShowProgressBar + "', isProgressBarDismissable='" + this.isProgressBarDismissable + "', isDefaultColor='" + this.isDefaultColor + "', textProgressComplete=" + this.textProgressComplete + ", textTapTitle=" + this.textTapTitle + ", textTapBody=" + this.textTapBody + ", textRemoveTitle=" + this.textRemoveTitle + ", textRemoveBody=" + this.textRemoveBody + ", textButtonKeep=" + this.textButtonKeep + ", textButtonTurnOff=" + this.textButtonTurnOff + ", textSkipVideoReminder=" + this.textSkipVideoReminder + ", videoSkipDuration=" + this.videoSkipDuration + ", style=" + this.style + ", stages=" + String.valueOf(this.stages) + "}";
        }

        public final void setDefaultColor(Boolean bool) {
            this.isDefaultColor = bool;
        }

        public final void setProgressBarDismissable(Boolean bool) {
            this.isProgressBarDismissable = bool;
        }

        public final void setShouldShowProgressBar(Boolean bool) {
            this.shouldShowProgressBar = bool;
        }

        public final void setStages(List<Stage> list) {
            this.stages = list;
        }

        public final void setStyle(Integer num) {
            this.style = num;
        }

        public final void setTextButtonKeep(String str) {
            this.textButtonKeep = str;
        }

        public final void setTextButtonTurnOff(String str) {
            this.textButtonTurnOff = str;
        }

        public final void setTextProgressComplete(String str) {
            this.textProgressComplete = str;
        }

        public final void setTextRemoveBody(String str) {
            this.textRemoveBody = str;
        }

        public final void setTextRemoveTitle(String str) {
            this.textRemoveTitle = str;
        }

        public final void setTextSkipVideoReminder(String str) {
            this.textSkipVideoReminder = str;
        }

        public final void setTextTapBody(String str) {
            this.textTapBody = str;
        }

        public final void setTextTapTitle(String str) {
            this.textTapTitle = str;
        }

        public final void setVideoSkipDuration(String str) {
            this.videoSkipDuration = str;
        }
    }

    public static final class Stage implements Serializable {
        @c(a = "progress_bar_copy")
        private String progressBarCopy = "";
        @c(a = "range")
        private List<Integer> range;

        static {
            Covode.recordClassIndex(59437);
        }

        public final String getProgressBarCopy() {
            return this.progressBarCopy;
        }

        public final List<Integer> getRange() {
            return this.range;
        }

        public final String toString() {
            List<Integer> list;
            String str;
            String str2 = this.progressBarCopy;
            if (str2 == null || p.a((CharSequence) str2) || (list = this.range) == null || list.isEmpty()) {
                return "";
            }
            StringBuilder append = new StringBuilder("{progress_bar_copy=").append(this.progressBarCopy).append(", range=");
            List<Integer> list2 = this.range;
            if (list2 != null) {
                str = n.a(list2, (CharSequence) null, "[", "]", 0, (CharSequence) null, (b) null, 57);
            } else {
                str = null;
            }
            return append.append(str).append("}").toString();
        }

        public final void setProgressBarCopy(String str) {
            this.progressBarCopy = str;
        }

        public final void setRange(List<Integer> list) {
            this.range = list;
        }
    }

    public static final class SwipeUpText implements Serializable {
        @c(a = "subtitle")
        private String subTitle = "";
        @c(a = "title")
        private String title = "";

        static {
            Covode.recordClassIndex(59438);
        }

        public final String getSubTitle() {
            return this.subTitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String toString() {
            return "{subTitle=" + this.subTitle + "title=" + this.title + "}";
        }

        public final void setSubTitle(String str) {
            this.subTitle = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }
    }

    public final String getAbVersion() {
        return this.abVersion;
    }

    public final ProgressBarInfo getProgressBarInfo() {
        return this.progressBarInfo;
    }

    public final SwipeUpText getSwipeUpText() {
        return this.swipeUpText;
    }

    public final String toString() {
        return String.valueOf(this.swipeUpText) + ", " + String.valueOf(this.progressBarInfo) + ", ab_version=" + this.abVersion;
    }

    public final void setAbVersion(String str) {
        this.abVersion = str;
    }

    public final void setProgressBarInfo(ProgressBarInfo progressBarInfo2) {
        this.progressBarInfo = progressBarInfo2;
    }

    public final void setSwipeUpText(SwipeUpText swipeUpText2) {
        this.swipeUpText = swipeUpText2;
    }
}
