param planName string

resource AppPlan 'Microsoft.Web/serverfarms@2020-06-01' = {
  name: planName
  location: resourceGroup().location
  sku:{
    name: 'S2'
    tier: 'Standard'
    size: 'S2'
    family: 'S'
    capacity: 1
  }
}
output AppPlanID string = AppPlan.id