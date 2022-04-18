package com.gukbit.dto;

import com.gukbit.domain.Academy;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class AcademyDto {

  private String code;
  private String name;
  private String home_url;
  private String region;
  private String addr;
  private double eval;
  private String tel;

  /*@Builder
  public AcademyDto(String code, String name, String home_url, String region,
      String addr, double eval, String tel){
    this.code=code;
    this.name=name;
    this.home_url=home_url;
    this.region=region;
    this.addr=addr;
    this.eval=eval;
    this.tel=tel;
  }*/
}