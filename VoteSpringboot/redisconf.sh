#!/usr/bin/env bash
vm.overcommit_memory = 1
sysctl vm.overcommit_memory=1
sudo su
echo never > /sys/kernel/mm/transparent_hugepage/enabled
cp /sys/kernel/mm/transparent_hugepage/enabled /etc/rc.local