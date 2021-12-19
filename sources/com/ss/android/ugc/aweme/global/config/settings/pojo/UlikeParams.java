package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class UlikeParams {
    @c(a = "enable_beauty_makeup")
    private Boolean enableBeautyMakeup;
    @c(a = "enable_beauty_sharpen")
    private Boolean enableBeautySharpen;
    @c(a = "ulike_blusher_default_value")
    private Float ulikeBlusherDefaultValue;
    @c(a = "ulike_eyes_default_value")
    private Float ulikeEyesDefaultValue;
    @c(a = "ulike_eyes_max_value")
    private Float ulikeEyesMaxValue;
    @c(a = "ulike_lip_default_value")
    private Float ulikeLipDefaultValue;
    @c(a = "ulike_shape_default_value")
    private Float ulikeShapeDefaultValue;
    @c(a = "ulike_shape_max_value")
    private Float ulikeShapeMaxValue;
    @c(a = "ulike_sharpen_default_value")
    private Float ulikeSharpenDefaultValue;
    @c(a = "ulike_smooth_default_value")
    private Float ulikeSmoothDefaultValue;
    @c(a = "ulike_smooth_max_value")
    private Float ulikeSmoothMaxValue;

    static {
        Covode.recordClassIndex(63101);
    }

    public Boolean getEnableBeautyMakeup() {
        return this.enableBeautyMakeup;
    }

    public Boolean getEnableBeautySharpen() {
        return this.enableBeautySharpen;
    }

    public Float getUlikeBlusherDefaultValue() {
        return this.ulikeBlusherDefaultValue;
    }

    public Float getUlikeEyesDefaultValue() {
        return this.ulikeEyesDefaultValue;
    }

    public Float getUlikeEyesMaxValue() {
        return this.ulikeEyesMaxValue;
    }

    public Float getUlikeLipDefaultValue() {
        return this.ulikeLipDefaultValue;
    }

    public Float getUlikeShapeDefaultValue() {
        return this.ulikeShapeDefaultValue;
    }

    public Float getUlikeShapeMaxValue() {
        return this.ulikeShapeMaxValue;
    }

    public Float getUlikeSharpenDefaultValue() {
        return this.ulikeSharpenDefaultValue;
    }

    public Float getUlikeSmoothDefaultValue() {
        return this.ulikeSmoothDefaultValue;
    }

    public Float getUlikeSmoothMaxValue() {
        return this.ulikeSmoothMaxValue;
    }
}
