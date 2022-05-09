terraform {
  required_providers {
    azurerm = {
      source  = "hashicorp/azurerm"
      version = "~> 3.0.2"
    }
  }

  required_version = ">= 1.1.0"
}

provider "azurerm" {
  features {}
}
resource "azurerm_resource_group" "rg" {
  name     = "rg-demo-java-servicebus"
  location = "eastus2"
  tags = {
    Source = "Terraform"
    Environment = "Desarrollo"
    Team = "Application"
    Objetive = "Demo or PoC"
  }
}

resource "azurerm_servicebus_namespace" "sb" {
  name                = "azsbdemodev01"
  location            = azurerm_resource_group.rg.location
  resource_group_name = azurerm_resource_group.rg.name
  sku                 = "Standard"

  tags = {
    Source = "Terraform"
    Environment = "Desarrollo"
    Team = "Application"
    Objetive = "Demo or PoC"
  }
}

resource "azurerm_servicebus_queue" "sb" {
  name         = "demo_servicebus_queue"
  namespace_id = azurerm_servicebus_namespace.sb.id
  enable_partitioning = true
}