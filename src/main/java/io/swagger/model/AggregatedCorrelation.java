package io.swagger.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-05T03:17:12.243Z")
public class AggregatedCorrelation  {
  
  private Integer id = null;
  private Float correlation = null;
  private Integer causeId = null;
  private Integer effectId = null;
  private Integer onsetDelay = null;
  private Integer durationOfAction = null;
  private Integer numberOfPairs = null;
  private Float valuePredictingHighOutcome = null;
  private Float valuePredictingLowOutcome = null;
  private Float optimalPearsonProduct = null;
  private Float vote = null;
  private Integer numberOfUsers = null;
  private Integer numberOfCorrelations = null;
  private Float statisticalSignificance = null;
  private String causeUnit = null;
  private Integer causeUnitId = null;
  private Integer causeChanges = null;
  private Integer effectChanges = null;
  private Float aggregateQmScore = null;
  private Date createdAt = null;
  private Date updatedAt = null;
  private String status = null;
  private String errorMessage = null;
  private Date lastSuccessfulUpdateTime = null;
  private Float reversePearsonCorrelationCoefficient = null;
  private Float predictivePearsonCorrelationCoefficient = null;

  
  /**
   * id
   **/
  @ApiModelProperty(value = "id")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * correlation
   **/
  @ApiModelProperty(required = true, value = "correlation")
  @JsonProperty("correlation")
  public Float getCorrelation() {
    return correlation;
  }
  public void setCorrelation(Float correlation) {
    this.correlation = correlation;
  }

  
  /**
   * cause_id
   **/
  @ApiModelProperty(required = true, value = "cause_id")
  @JsonProperty("cause_id")
  public Integer getCauseId() {
    return causeId;
  }
  public void setCauseId(Integer causeId) {
    this.causeId = causeId;
  }

  
  /**
   * effect_id
   **/
  @ApiModelProperty(required = true, value = "effect_id")
  @JsonProperty("effect_id")
  public Integer getEffectId() {
    return effectId;
  }
  public void setEffectId(Integer effectId) {
    this.effectId = effectId;
  }

  
  /**
   * onset_delay
   **/
  @ApiModelProperty(required = true, value = "onset_delay")
  @JsonProperty("onset_delay")
  public Integer getOnsetDelay() {
    return onsetDelay;
  }
  public void setOnsetDelay(Integer onsetDelay) {
    this.onsetDelay = onsetDelay;
  }

  
  /**
   * duration_of_action
   **/
  @ApiModelProperty(required = true, value = "duration_of_action")
  @JsonProperty("duration_of_action")
  public Integer getDurationOfAction() {
    return durationOfAction;
  }
  public void setDurationOfAction(Integer durationOfAction) {
    this.durationOfAction = durationOfAction;
  }

  
  /**
   * number_of_pairs
   **/
  @ApiModelProperty(required = true, value = "number_of_pairs")
  @JsonProperty("number_of_pairs")
  public Integer getNumberOfPairs() {
    return numberOfPairs;
  }
  public void setNumberOfPairs(Integer numberOfPairs) {
    this.numberOfPairs = numberOfPairs;
  }

  
  /**
   * value_predicting_high_outcome
   **/
  @ApiModelProperty(required = true, value = "value_predicting_high_outcome")
  @JsonProperty("value_predicting_high_outcome")
  public Float getValuePredictingHighOutcome() {
    return valuePredictingHighOutcome;
  }
  public void setValuePredictingHighOutcome(Float valuePredictingHighOutcome) {
    this.valuePredictingHighOutcome = valuePredictingHighOutcome;
  }

  
  /**
   * value_predicting_low_outcome
   **/
  @ApiModelProperty(required = true, value = "value_predicting_low_outcome")
  @JsonProperty("value_predicting_low_outcome")
  public Float getValuePredictingLowOutcome() {
    return valuePredictingLowOutcome;
  }
  public void setValuePredictingLowOutcome(Float valuePredictingLowOutcome) {
    this.valuePredictingLowOutcome = valuePredictingLowOutcome;
  }

  
  /**
   * optimal_pearson_product
   **/
  @ApiModelProperty(required = true, value = "optimal_pearson_product")
  @JsonProperty("optimal_pearson_product")
  public Float getOptimalPearsonProduct() {
    return optimalPearsonProduct;
  }
  public void setOptimalPearsonProduct(Float optimalPearsonProduct) {
    this.optimalPearsonProduct = optimalPearsonProduct;
  }

  
  /**
   * vote
   **/
  @ApiModelProperty(required = true, value = "vote")
  @JsonProperty("vote")
  public Float getVote() {
    return vote;
  }
  public void setVote(Float vote) {
    this.vote = vote;
  }

  
  /**
   * number_of_users
   **/
  @ApiModelProperty(required = true, value = "number_of_users")
  @JsonProperty("number_of_users")
  public Integer getNumberOfUsers() {
    return numberOfUsers;
  }
  public void setNumberOfUsers(Integer numberOfUsers) {
    this.numberOfUsers = numberOfUsers;
  }

  
  /**
   * number_of_correlations
   **/
  @ApiModelProperty(required = true, value = "number_of_correlations")
  @JsonProperty("number_of_correlations")
  public Integer getNumberOfCorrelations() {
    return numberOfCorrelations;
  }
  public void setNumberOfCorrelations(Integer numberOfCorrelations) {
    this.numberOfCorrelations = numberOfCorrelations;
  }

  
  /**
   * statistical_significance
   **/
  @ApiModelProperty(required = true, value = "statistical_significance")
  @JsonProperty("statistical_significance")
  public Float getStatisticalSignificance() {
    return statisticalSignificance;
  }
  public void setStatisticalSignificance(Float statisticalSignificance) {
    this.statisticalSignificance = statisticalSignificance;
  }

  
  /**
   * cause_unit
   **/
  @ApiModelProperty(required = true, value = "cause_unit")
  @JsonProperty("cause_unit")
  public String getCauseUnit() {
    return causeUnit;
  }
  public void setCauseUnit(String causeUnit) {
    this.causeUnit = causeUnit;
  }

  
  /**
   * cause_unit_id
   **/
  @ApiModelProperty(required = true, value = "cause_unit_id")
  @JsonProperty("cause_unit_id")
  public Integer getCauseUnitId() {
    return causeUnitId;
  }
  public void setCauseUnitId(Integer causeUnitId) {
    this.causeUnitId = causeUnitId;
  }

  
  /**
   * cause_changes
   **/
  @ApiModelProperty(required = true, value = "cause_changes")
  @JsonProperty("cause_changes")
  public Integer getCauseChanges() {
    return causeChanges;
  }
  public void setCauseChanges(Integer causeChanges) {
    this.causeChanges = causeChanges;
  }

  
  /**
   * effect_changes
   **/
  @ApiModelProperty(required = true, value = "effect_changes")
  @JsonProperty("effect_changes")
  public Integer getEffectChanges() {
    return effectChanges;
  }
  public void setEffectChanges(Integer effectChanges) {
    this.effectChanges = effectChanges;
  }

  
  /**
   * aggregate_qm_score
   **/
  @ApiModelProperty(required = true, value = "aggregate_qm_score")
  @JsonProperty("aggregate_qm_score")
  public Float getAggregateQmScore() {
    return aggregateQmScore;
  }
  public void setAggregateQmScore(Float aggregateQmScore) {
    this.aggregateQmScore = aggregateQmScore;
  }

  
  /**
   * created_at
   **/
  @ApiModelProperty(value = "created_at")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * updated_at
   **/
  @ApiModelProperty(value = "updated_at")
  @JsonProperty("updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  
  /**
   * status
   **/
  @ApiModelProperty(required = true, value = "status")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * error_message
   **/
  @ApiModelProperty(required = true, value = "error_message")
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  /**
   * last_successful_update_time
   **/
  @ApiModelProperty(required = true, value = "last_successful_update_time")
  @JsonProperty("last_successful_update_time")
  public Date getLastSuccessfulUpdateTime() {
    return lastSuccessfulUpdateTime;
  }
  public void setLastSuccessfulUpdateTime(Date lastSuccessfulUpdateTime) {
    this.lastSuccessfulUpdateTime = lastSuccessfulUpdateTime;
  }

  
  /**
   * reverse_pearson_correlation_coefficient
   **/
  @ApiModelProperty(required = true, value = "reverse_pearson_correlation_coefficient")
  @JsonProperty("reverse_pearson_correlation_coefficient")
  public Float getReversePearsonCorrelationCoefficient() {
    return reversePearsonCorrelationCoefficient;
  }
  public void setReversePearsonCorrelationCoefficient(Float reversePearsonCorrelationCoefficient) {
    this.reversePearsonCorrelationCoefficient = reversePearsonCorrelationCoefficient;
  }

  
  /**
   * predictive_pearson_correlation_coefficient
   **/
  @ApiModelProperty(required = true, value = "predictive_pearson_correlation_coefficient")
  @JsonProperty("predictive_pearson_correlation_coefficient")
  public Float getPredictivePearsonCorrelationCoefficient() {
    return predictivePearsonCorrelationCoefficient;
  }
  public void setPredictivePearsonCorrelationCoefficient(Float predictivePearsonCorrelationCoefficient) {
    this.predictivePearsonCorrelationCoefficient = predictivePearsonCorrelationCoefficient;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedCorrelation {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  correlation: ").append(correlation).append("\n");
    sb.append("  causeId: ").append(causeId).append("\n");
    sb.append("  effectId: ").append(effectId).append("\n");
    sb.append("  onsetDelay: ").append(onsetDelay).append("\n");
    sb.append("  durationOfAction: ").append(durationOfAction).append("\n");
    sb.append("  numberOfPairs: ").append(numberOfPairs).append("\n");
    sb.append("  valuePredictingHighOutcome: ").append(valuePredictingHighOutcome).append("\n");
    sb.append("  valuePredictingLowOutcome: ").append(valuePredictingLowOutcome).append("\n");
    sb.append("  optimalPearsonProduct: ").append(optimalPearsonProduct).append("\n");
    sb.append("  vote: ").append(vote).append("\n");
    sb.append("  numberOfUsers: ").append(numberOfUsers).append("\n");
    sb.append("  numberOfCorrelations: ").append(numberOfCorrelations).append("\n");
    sb.append("  statisticalSignificance: ").append(statisticalSignificance).append("\n");
    sb.append("  causeUnit: ").append(causeUnit).append("\n");
    sb.append("  causeUnitId: ").append(causeUnitId).append("\n");
    sb.append("  causeChanges: ").append(causeChanges).append("\n");
    sb.append("  effectChanges: ").append(effectChanges).append("\n");
    sb.append("  aggregateQmScore: ").append(aggregateQmScore).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  errorMessage: ").append(errorMessage).append("\n");
    sb.append("  lastSuccessfulUpdateTime: ").append(lastSuccessfulUpdateTime).append("\n");
    sb.append("  reversePearsonCorrelationCoefficient: ").append(reversePearsonCorrelationCoefficient).append("\n");
    sb.append("  predictivePearsonCorrelationCoefficient: ").append(predictivePearsonCorrelationCoefficient).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
