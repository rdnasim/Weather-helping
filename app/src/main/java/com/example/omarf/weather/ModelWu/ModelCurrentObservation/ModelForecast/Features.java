
package com.example.omarf.weather.ModelWu.ModelCurrentObservation.ModelForecast;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Features {

    @SerializedName("forecast")
    @Expose
    private Integer forecast;

    public Integer getForecast() {
        return forecast;
    }

    public void setForecast(Integer forecast) {
        this.forecast = forecast;
    }

}
