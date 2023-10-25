terraform {
    required_providers{
    google ={
        source  = "hashicorp/google"
    }
      }
}
provider "google" {
  credentials = file("name.json")

  project = "<PEPITO_ID>"
  region = "es-central"
  zone = "es-central"
}

resource "google_compute_instance" "pepito" {
  name = "hi"
  machine_type = "e2-meidum"
  zone = "es-central"

  boot_disk {
    initialize_params {
      image = "debian-cloud/debian-9"
    }
  }

  network_interface {
    network = "default"
    access_config {
    }
  }
}